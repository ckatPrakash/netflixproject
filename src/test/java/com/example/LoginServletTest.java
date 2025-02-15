import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.LoginServlet;

public class LoginServletTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    private LoginServlet loginServlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        loginServlet = new LoginServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        when(request.getParameter("username")).thenReturn("testuser");
        when(request.getParameter("password")).thenReturn("testpass");

        loginServlet.doPost(request, response);

        verify(request, times(1)).getParameter("username");
        verify(request, times(1)).getParameter("password");
        verify(response).sendRedirect("login.jsp");
    }
}