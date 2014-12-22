package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author krzs
 */
public class MyRequestTest
{

   @Test(expected = IllegalStateException.class)
   public void testValidateEmpty()
   {
      MyRequest req = new MyRequest();
      req.validate();
   }

   @Test
   public void testValidateOk()
   {
      final Long userId = 99L;

      MyRequest req = new MyRequest();
      req.setUserId(userId);
      req.validate();

      assertEquals(userId, req.getUserId());
   }
}
