package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.CQf;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class pa1 implements Handler.Callback {
    public static final Status K = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status L = new Status(4, "The user must be signed in to make this API call.");
    public static final Object M = new Object();

    @GuardedBy("lock")
    public static pa1 N;
    public final Context A;
    public final na1 B;
    public final ar5 C;
    public final AtomicInteger D;
    public final AtomicInteger E;
    public final ConcurrentHashMap F;

    @GuardedBy("lock")
    public final Q6g G;
    public final Q6g H;

    @NotOnlyInitialized
    public final mr5 I;
    public volatile boolean J;
    public long w;
    public boolean x;
    public n15 y;
    public ir5 z;

    public pa1(Context context, Looper looper) {
        na1 na1Var = na1.d;
        this.w = 10000L;
        this.x = false;
        this.D = new AtomicInteger(1);
        this.E = new AtomicInteger(0);
        this.F = new ConcurrentHashMap(5, 0.75f, 1);
        this.G = new Q6g();
        this.H = new Q6g();
        this.J = true;
        this.A = context;
        mr5 mr5Var = new mr5(looper, this);
        this.I = mr5Var;
        this.B = na1Var;
        this.C = new ar5();
        PackageManager packageManager = context.getPackageManager();
        if (ik0.e == null) {
            ik0.e = Boolean.valueOf(x53.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (ik0.e.booleanValue()) {
            this.J = false;
        }
        mr5Var.sendMessage(mr5Var.obtainMessage(6));
    }

    public static Status c(Hp<?> hp, z50 z50Var) {
        String str = hp.b.b;
        String strValueOf = String.valueOf(z50Var);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(1, 17, sb.toString(), z50Var.y, z50Var);
    }

    public static pa1 e(Context context) {
        pa1 pa1Var;
        HandlerThread handlerThread;
        synchronized (M) {
            try {
                if (N == null) {
                    synchronized (ma1.a) {
                        handlerThread = ma1.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ma1.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ma1.c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = na1.c;
                    N = new pa1(applicationContext, looper);
                }
                pa1Var = N;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pa1Var;
    }

    public final boolean a() {
        if (this.x) {
            return false;
        }
        ht3 ht3Var = gt3.a().a;
        if (ht3Var != null && !ht3Var.x) {
            return false;
        }
        int i = this.C.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(z50 z50Var, int i) {
        PendingIntent activity;
        na1 na1Var = this.B;
        na1Var.getClass();
        Context context = this.A;
        if (fp1.h0(context)) {
            return false;
        }
        int i2 = z50Var.x;
        if ((i2 == 0 || z50Var.y == null) ? false : true) {
            activity = z50Var.y;
        } else {
            activity = null;
            Intent intentB = na1Var.b(context, null, i2);
            if (intentB != null) {
                activity = PendingIntent.getActivity(context, 0, intentB, fd6.a | 134217728);
            }
        }
        if (activity == null) {
            return false;
        }
        int i3 = GoogleApiActivity.x;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        na1Var.h(context, i2, PendingIntent.getActivity(context, 0, intent, br5.a | 134217728));
        return true;
    }

    public final tp5<?> d(CQf<?> cQf) {
        Object obj = cQf.e;
        ConcurrentHashMap concurrentHashMap = this.F;
        tp5<?> tp5Var = (tp5) concurrentHashMap.get(obj);
        if (tp5Var == null) {
            tp5Var = new tp5<>(this, cQf);
            concurrentHashMap.put(obj, tp5Var);
        }
        if (tp5Var.x.requiresSignIn()) {
            this.H.add(obj);
        }
        tp5Var.k();
        return tp5Var;
    }

    public final void f(z50 z50Var, int i) {
        if (b(z50Var, i)) {
            return;
        }
        mr5 mr5Var = this.I;
        mr5Var.sendMessage(mr5Var.obtainMessage(5, i, 0, z50Var));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0307  */
    /* JADX WARN: Code duplicated, block: B:154:0x030d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0352  */
    /* JADX WARN: Code duplicated, block: B:156:0x035d  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        tw0[] tw0VarArrG;
        boolean z;
        int i = message.what;
        mr5 mr5Var = this.I;
        ConcurrentHashMap concurrentHashMap = this.F;
        tp5 tp5Var = null;
        switch (i) {
            case 1:
                this.w = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                mr5Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    mr5Var.sendMessageDelayed(mr5Var.obtainMessage(12, (Hp) it.next()), this.w);
                }
                return true;
            case 2:
                ((er5) message.obj).getClass();
                throw null;
            case 3:
                for (tp5 tp5Var2 : concurrentHashMap.values()) {
                    oa3.c(tp5Var2.I.I);
                    tp5Var2.G = null;
                    tp5Var2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                gq5 gq5Var = (gq5) message.obj;
                tp5<?> tp5VarD = (tp5) concurrentHashMap.get(gq5Var.c.e);
                if (tp5VarD == null) {
                    tp5VarD = d(gq5Var.c);
                }
                boolean zRequiresSignIn = tp5VarD.x.requiresSignIn();
                xq5 xq5Var = gq5Var.a;
                if (!zRequiresSignIn || this.E.get() == gq5Var.b) {
                    tp5VarD.l(xq5Var);
                } else {
                    xq5Var.a(K);
                    tp5VarD.n();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                z50 z50Var = (z50) message.obj;
                for (tp5 tp5Var3 : concurrentHashMap.values()) {
                    if (tp5Var3.C == i2) {
                        tp5Var = tp5Var3;
                        if (tp5Var != null) {
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Could not find API instance ");
                            sb.append(i2);
                            sb.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                        } else if (z50Var.x == 13) {
                            this.B.getClass();
                            AtomicBoolean atomicBoolean = ra1.a;
                            String strB = z50.b(z50Var.x);
                            int length = String.valueOf(strB).length();
                            String str = z50Var.z;
                            StringBuilder sb2 = new StringBuilder(length + 69 + String.valueOf(str).length());
                            sb2.append("Error resolution was canceled by the user, original error message: ");
                            sb2.append(strB);
                            sb2.append(": ");
                            sb2.append(str);
                            tp5Var.b(new Status(17, sb2.toString()));
                        } else {
                            tp5Var.b(c(tp5Var.y, z50Var));
                        }
                        return true;
                    }
                }
                if (tp5Var != null) {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                } else if (z50Var.x == 13) {
                    this.B.getClass();
                    AtomicBoolean atomicBoolean2 = ra1.a;
                    String strB2 = z50.b(z50Var.x);
                    int length2 = String.valueOf(strB2).length();
                    String str2 = z50Var.z;
                    StringBuilder sb4 = new StringBuilder(length2 + 69 + String.valueOf(str2).length());
                    sb4.append("Error resolution was canceled by the user, original error message: ");
                    sb4.append(strB2);
                    sb4.append(": ");
                    sb4.append(str2);
                    tp5Var.b(new Status(17, sb4.toString()));
                } else {
                    tp5Var.b(c(tp5Var.y, z50Var));
                }
                return true;
            case 6:
                Context context = this.A;
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    l5 l5Var = l5.A;
                    synchronized (l5Var) {
                        if (!l5Var.z) {
                            application.registerActivityLifecycleCallbacks(l5Var);
                            application.registerComponentCallbacks(l5Var);
                            l5Var.z = true;
                        }
                        break;
                    }
                    pp5 pp5Var = new pp5(this);
                    l5Var.getClass();
                    synchronized (l5Var) {
                        l5Var.y.add(pp5Var);
                        break;
                    }
                    AtomicBoolean atomicBoolean3 = l5Var.x;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            l5Var.w.set(true);
                        }
                    }
                    if (!l5Var.w.get()) {
                        this.w = 300000L;
                    }
                }
                return true;
            case 7:
                d((CQf) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    tp5 tp5Var4 = (tp5) concurrentHashMap.get(message.obj);
                    oa3.c(tp5Var4.I.I);
                    if (tp5Var4.E) {
                        tp5Var4.k();
                    }
                }
                return true;
            case 10:
                Q6g q6g = this.H;
                Iterator it2 = q6g.iterator();
                while (true) {
                    g92.QnHx qnHx = (g92.QnHx) it2;
                    if (!qnHx.hasNext()) {
                        q6g.clear();
                        return true;
                    }
                    tp5 tp5Var5 = (tp5) concurrentHashMap.remove((Hp) qnHx.next());
                    if (tp5Var5 != null) {
                        tp5Var5.n();
                    }
                }
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    tp5 tp5Var6 = (tp5) concurrentHashMap.get(message.obj);
                    pa1 pa1Var = tp5Var6.I;
                    oa3.c(pa1Var.I);
                    boolean z2 = tp5Var6.E;
                    if (z2) {
                        if (z2) {
                            pa1 pa1Var2 = tp5Var6.I;
                            mr5 mr5Var2 = pa1Var2.I;
                            Object obj = tp5Var6.y;
                            mr5Var2.removeMessages(11, obj);
                            pa1Var2.I.removeMessages(9, obj);
                            tp5Var6.E = false;
                        }
                        tp5Var6.b(pa1Var.B.d(pa1Var.A) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        tp5Var6.x.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((tp5) concurrentHashMap.get(message.obj)).j(true);
                }
                return true;
            case 14:
                ((ip5) message.obj).getClass();
                if (!concurrentHashMap.containsKey(null)) {
                    throw null;
                }
                ((tp5) concurrentHashMap.get(null)).j(false);
                throw null;
            case 15:
                up5 up5Var = (up5) message.obj;
                if (concurrentHashMap.containsKey(up5Var.a)) {
                    tp5 tp5Var7 = (tp5) concurrentHashMap.get(up5Var.a);
                    if (tp5Var7.F.contains(up5Var) && !tp5Var7.E) {
                        if (tp5Var7.x.isConnected()) {
                            tp5Var7.d();
                        } else {
                            tp5Var7.k();
                        }
                    }
                }
                return true;
            case 16:
                up5 up5Var2 = (up5) message.obj;
                if (concurrentHashMap.containsKey(up5Var2.a)) {
                    tp5<?> tp5Var8 = (tp5) concurrentHashMap.get(up5Var2.a);
                    if (tp5Var8.F.remove(up5Var2)) {
                        pa1 pa1Var3 = tp5Var8.I;
                        pa1Var3.I.removeMessages(15, up5Var2);
                        pa1Var3.I.removeMessages(16, up5Var2);
                        LinkedList linkedList = tp5Var8.w;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            tw0 tw0Var = up5Var2.b;
                            if (zHasNext) {
                                xq5 xq5Var2 = (xq5) it3.next();
                                if ((xq5Var2 instanceof zp5) && (tw0VarArrG = ((zp5) xq5Var2).g(tp5Var8)) != null) {
                                    int length3 = tw0VarArrG.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length3) {
                                            if (tq2.a(tw0VarArrG[i3], tw0Var)) {
                                                z = i3 >= 0;
                                            } else {
                                                i3++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        arrayList.add(xq5Var2);
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    xq5 xq5Var3 = (xq5) arrayList.get(i4);
                                    linkedList.remove(xq5Var3);
                                    xq5Var3.b(new UnsupportedApiCallException(tw0Var));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                n15 n15Var = this.y;
                if (n15Var != null) {
                    if (n15Var.w > 0 || a()) {
                        if (this.z == null) {
                            this.z = new ir5(this.A);
                        }
                        this.z.d(n15Var);
                    }
                    this.y = null;
                }
                return true;
            case 18:
                fq5 fq5Var = (fq5) message.obj;
                long j = fq5Var.c;
                ge2 ge2Var = fq5Var.a;
                int i5 = fq5Var.b;
                if (j == 0) {
                    n15 n15Var2 = new n15(Arrays.asList(ge2Var), i5);
                    if (this.z == null) {
                        this.z = new ir5(this.A);
                    }
                    this.z.d(n15Var2);
                } else {
                    n15 n15Var3 = this.y;
                    if (n15Var3 != null) {
                        List<ge2> list = n15Var3.x;
                        if (n15Var3.w != i5 || (list != null && list.size() >= fq5Var.d)) {
                            mr5Var.removeMessages(17);
                            n15 n15Var4 = this.y;
                            if (n15Var4 != null) {
                                if (n15Var4.w > 0 || a()) {
                                    if (this.z == null) {
                                        this.z = new ir5(this.A);
                                    }
                                    this.z.d(n15Var4);
                                }
                                this.y = null;
                            }
                        } else {
                            n15 n15Var5 = this.y;
                            if (n15Var5.x == null) {
                                n15Var5.x = new ArrayList();
                            }
                            n15Var5.x.add(ge2Var);
                        }
                    }
                    if (this.y == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ge2Var);
                        this.y = new n15(arrayList2, i5);
                        mr5Var.sendMessageDelayed(mr5Var.obtainMessage(17), fq5Var.c);
                    }
                }
                return true;
            case 19:
                this.x = false;
                return true;
            default:
                StringBuilder sb5 = new StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i);
                Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }
}
