package com.horaoen.devkit;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Getter
public class ResultTest {
    @Test
    public void okTest() {
        UnifiedResponse<String> result = Result.ok("aaa");
        System.out.println(result);
        assertNotNull(result.getData());
    }
    
    @Test
    public void errTest() {
        UnifiedResponse<?> result = Result.error("aaa");
        System.out.println(result);
        assertNull(result.getData());
        assertNotNull(result.getErrMsg());
    }
    
    @Test
    public void errByPassErrType() {
        UnifiedResponse<?> errorResult = Result.error(CustomErrType.NULL_ID);
        System.out.println(errorResult);
        assertEquals(CustomErrType.NULL_ID.getCode(), errorResult.getCode());
        assertEquals(CustomErrType.NULL_ID.getErrMsg(), errorResult.getErrMsg());
    }
}
