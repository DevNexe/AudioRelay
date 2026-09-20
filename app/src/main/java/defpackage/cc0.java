package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class cc0 {
    public static final HashMap e;
    public static final String f;
    public final Context a;
    public final th1 b;
    public final Ncry c;
    public final nr4 d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.13");
    }

    public cc0(Context context, th1 th1Var, Ncry ncry, ss5 ss5Var) {
        this.a = context;
        this.b = th1Var;
        this.c = ncry;
        this.d = ss5Var;
    }

    public static e3 c(ma5 ma5Var, int i) {
        String str = (String) ma5Var.x;
        String str2 = (String) ma5Var.w;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) ma5Var.y;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ma5 ma5Var2 = (ma5) ma5Var.z;
        if (i >= 8) {
            ma5 ma5Var3 = ma5Var2;
            while (ma5Var3 != null) {
                ma5Var3 = (ma5) ma5Var3.z;
                i2++;
            }
        }
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        lj1 lj1Var = new lj1(d(stackTraceElementArr, 4));
        Integer numValueOf = Integer.valueOf(i2);
        e3 e3VarC = null;
        if (ma5Var2 != null && i2 == 0) {
            e3VarC = c(ma5Var2, i + 1);
        }
        String strA = numValueOf == null ? rz.a("", " overflowCount") : "";
        if (strA.isEmpty()) {
            return new e3(str, str2, lj1Var, e3VarC, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strA));
    }

    public static lj1 d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            h3.QnHx qnHx = new h3.QnHx();
            qnHx.e = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            qnHx.a = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            qnHx.b = str;
            qnHx.c = fileName;
            qnHx.d = Long.valueOf(lineNumber);
            arrayList.add(qnHx.a());
        }
        return new lj1(arrayList);
    }

    public static g3 e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        Integer numValueOf = Integer.valueOf(i);
        lj1 lj1Var = new lj1(d(stackTraceElementArr, i));
        String strConcat = numValueOf == null ? "".concat(" importance") : "";
        if (strConcat.isEmpty()) {
            return new g3(name, numValueOf.intValue(), lj1Var);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx> a() {
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx[] abstractC0052QnHxArr = new bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx[1];
        d3.QnHx qnHx = new d3.QnHx();
        qnHx.a = 0L;
        qnHx.b = 0L;
        Ncry ncry = this.c;
        String str = ncry.d;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        qnHx.c = str;
        qnHx.d = ncry.b;
        abstractC0052QnHxArr[0] = qnHx.a();
        return new lj1<>(Arrays.asList(abstractC0052QnHxArr));
    }

    public final i3 b(int i) {
        boolean z;
        Float fValueOf;
        Context context = this.a;
        int i2 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
            } else {
                fValueOf = null;
                z = false;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z || fValueOf == null) {
            i2 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i2 = 3;
        }
        boolean z2 = (kw.i() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
        long jG = kw.g();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jG - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        i3.QnHx qnHx = new i3.QnHx();
        qnHx.a = dValueOf;
        qnHx.b = Integer.valueOf(i2);
        qnHx.c = Boolean.valueOf(z2);
        qnHx.d = Integer.valueOf(i);
        qnHx.e = Long.valueOf(j);
        qnHx.f = Long.valueOf(blockCount);
        return qnHx.a();
    }
}
