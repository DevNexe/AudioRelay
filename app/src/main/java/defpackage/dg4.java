package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import bp3.QnHx;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class dg4 {
    public final cc0 a;
    public final fc0 b;
    public final bf0 c;
    public final m52 d;
    public final gf5 e;

    public dg4(cc0 cc0Var, fc0 fc0Var, bf0 bf0Var, m52 m52Var, gf5 gf5Var) {
        this.a = cc0Var;
        this.b = fc0Var;
        this.c = bf0Var;
        this.d = m52Var;
        this.e = gf5Var;
    }

    public static a3 a(a3 a3Var, m52 m52Var, gf5 gf5Var) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        a3.QnHx qnHx = new a3.QnHx(a3Var);
        String strB = m52Var.b.b();
        if (strB != null) {
            qnHx.e = new j3(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        sw1 reference = gf5Var.d.a.getReference();
        synchronized (reference) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
        }
        ArrayList arrayListC = c(mapUnmodifiableMap);
        sw1 reference2 = gf5Var.e.a.getReference();
        synchronized (reference2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.a));
        }
        ArrayList arrayListC2 = c(mapUnmodifiableMap2);
        if (!arrayListC.isEmpty() || !arrayListC2.isEmpty()) {
            b3.QnHx qnHxF = a3Var.c.f();
            qnHxF.b = new lj1<>(arrayListC);
            qnHxF.c = new lj1<>(arrayListC2);
            qnHx.c = qnHxF.a();
        }
        return qnHx.a();
    }

    public static dg4 b(Context context, th1 th1Var, fx0 fx0Var, Ncry ncry, m52 m52Var, gf5 gf5Var, ss5 ss5Var, xg4 xg4Var, ss3 ss3Var) {
        cc0 cc0Var = new cc0(context, th1Var, ncry, ss5Var);
        fc0 fc0Var = new fc0(fx0Var, xg4Var);
        dc0 dc0Var = bf0.b;
        ya5.b(context);
        ya5 ya5VarA = ya5.a();
        rk rkVar = new rk(bf0.c, bf0.d);
        ya5VarA.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(rk.d);
        j4.QnHx qnHxA = ua5.a();
        qnHxA.b("cct");
        qnHxA.b = rkVar.b();
        j4 j4VarA = qnHxA.a();
        os0 os0Var = new os0("json");
        n8V_ n8v_ = bf0.e;
        Set set = setUnmodifiableSet;
        if (set.contains(os0Var)) {
            return new dg4(cc0Var, fc0Var, new bf0(new bp3(new wa5(j4VarA, os0Var, n8v_, ya5VarA), xg4Var.h.get(), ss3Var)), m52Var, gf5Var);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", os0Var, set));
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new s2(str, str2));
        }
        Collections.sort(arrayList, new sy1(1));
        return arrayList;
    }

    public final void d(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        ActivityManager.RunningAppProcessInfo next;
        boolean zEquals = str2.equals("crash");
        cc0 cc0Var = this.a;
        Context context = cc0Var.a;
        int i = context.getResources().getConfiguration().orientation;
        nr4 nr4Var = cc0Var.d;
        ma5 ma5Var = new ma5(th, nr4Var);
        a3.QnHx qnHx = new a3.QnHx();
        qnHx.b = str2;
        qnHx.a = Long.valueOf(j);
        String str3 = cc0Var.c.d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            next = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.processName.equals(str3));
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cc0.e(thread, (StackTraceElement[]) ma5Var.y, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(cc0.e(key, nr4Var.a(entry.getValue()), 0));
                }
            }
        }
        lj1 lj1Var = new lj1(arrayList);
        e3 e3VarC = cc0.c(ma5Var, 0);
        Long l = 0L;
        String str4 = l == null ? " address" : "";
        if (!str4.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str4));
        }
        c3 c3Var = new c3(lj1Var, e3VarC, null, new f3("0", "0", l.longValue()), cc0Var.a());
        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        qnHx.c = new b3(c3Var, null, null, boolValueOf, numValueOf.intValue());
        qnHx.d = cc0Var.b(i);
        this.b.c(a(qnHx.a(), this.d, this.e), str, zEquals);
    }

    public final kc7 e(String str, Executor executor) {
        z05<gc0> z05Var;
        ArrayList<File> arrayListB = this.b.b();
        ArrayList<gc0> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                dc0 dc0Var = fc0.f;
                String strD = fc0.d(file);
                dc0Var.getClass();
                arrayList.add(new q2(dc0.g(strD), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (gc0 gc0Var : arrayList) {
            if (str == null || str.equals(gc0Var.c())) {
                bf0 bf0Var = this.c;
                boolean z = str != null;
                bp3 bp3Var = bf0Var.a;
                synchronized (bp3Var.e) {
                    z05Var = new z05<>();
                    if (z) {
                        ((AtomicInteger) bp3Var.h.x).getAndIncrement();
                        if (bp3Var.e.size() < bp3Var.d) {
                            kK kKVar = kK.x;
                            kKVar.c("Enqueueing report: " + gc0Var.c());
                            kKVar.c("Queue size: " + bp3Var.e.size());
                            bp3Var.f.execute(bp3Var.new QnHx(gc0Var, z05Var));
                            kKVar.c("Closing task for report: " + gc0Var.c());
                            z05Var.c(gc0Var);
                        } else {
                            bp3Var.a();
                            String str2 = "Dropping report due to queue being full: " + gc0Var.c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            ((AtomicInteger) bp3Var.h.y).getAndIncrement();
                            z05Var.c(gc0Var);
                        }
                    } else {
                        bp3Var.b(gc0Var, z05Var);
                    }
                }
                arrayList2.add(z05Var.a.f(executor, new im3(this, 11)));
            }
        }
        return k15.f(arrayList2);
    }
}
