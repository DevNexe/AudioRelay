package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.QnHx;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;

/* JADX INFO: loaded from: classes.dex */
public final class Fxu4 {
    public static final String a = s52.e("Alarms");

    public static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, QnHx.a(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        s52.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, nn5 nn5Var, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = nn5Var.y;
        hz4 hz4Var = (hz4) workDatabase.k();
        SystemIdInfo systemIdInfoA = hz4Var.a(str);
        if (systemIdInfoA != null) {
            a(context, str, systemIdInfoA.b);
            c(context, str, systemIdInfoA.b, j);
            return;
        }
        synchronized (sh1.class) {
            workDatabase.c();
            try {
                Long lA = ((ta3) workDatabase.j()).a("next_alarm_manager_id");
                int i = 0;
                iIntValue = lA != null ? lA.intValue() : 0;
                if (iIntValue != Integer.MAX_VALUE) {
                    i = iIntValue + 1;
                }
                ((ta3) workDatabase.j()).b(new Preference("next_alarm_manager_id", i));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        SystemIdInfo systemIdInfo = new SystemIdInfo(str, iIntValue);
        at3 at3Var = hz4Var.a;
        at3Var.b();
        at3Var.c();
        try {
            hz4Var.b.e(systemIdInfo);
            at3Var.h();
            at3Var.f();
            c(context, str, iIntValue, j);
        } catch (Throwable th2) {
            at3Var.f();
            throw th2;
        }
    }

    public static void c(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, QnHx.a(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
