import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DynamicIntArrayTest  {

  @Test
  void testAppend(){
    DynamicIntArray testObj = new DynamicIntArray(1);
    testObj.append(1);
    testObj.append(2);

    assertThat(testObj.array.length).isEqualTo(2);
    testObj.append(3);
    assertThat(testObj.array.length).isEqualTo(4).as("Base array should double in size");
  }

  @Test
  void testPopIndex(){
    DynamicIntArray testObj = new DynamicIntArray(1);
    testObj.append(1);
    testObj.append(2);
    testObj.append(3);
    assertThat(testObj.array.length).isEqualTo(4);
    assertThatThrownBy(()-> { testObj.popIndex(3);}).isInstanceOf(IndexOutOfBoundsException.class);
    assertThat(testObj.popIndex(2)).isEqualTo(3);
    assertThat(testObj.array.length).isEqualTo(4);
    assertThat(testObj.size()).isEqualTo(2);
  }
    
}
