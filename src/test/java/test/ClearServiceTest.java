package test;

import DataAccess.DataAccessException;
import Service.ClearService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ClearServiceTest {
    private ClearService clearService;

    @BeforeEach
    public void setUp() throws DataAccessException {
        clearService = new ClearService();
    }

    @Test
    public void ClearTest() {
        assertTrue(clearService.clear().isSuccess());
    }

    @Test
    public void ClearTestTwo() {
        assertEquals("Clear Succeeded", clearService.clear().getMessage());
    }


}
