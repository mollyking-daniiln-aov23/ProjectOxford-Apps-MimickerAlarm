package com.microsoft.smartalarm;
import com.microsoft.mimickeralarm.model.Alarm;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlarmTest {
    @Test
    public void testAlarm_enableSnooze() throws Exception {
        Alarm alarm = new Alarm(null);
        alarm.setSnooze(true);
        assertEquals(true, alarm.shouldSnooze());
    }

    @Test
    public void testAlarm_disableSnooze() throws Exception {
        Alarm alarm = new Alarm(null);
        alarm.setSnooze(false);
        assertEquals(false, alarm.shouldSnooze());
    }
}