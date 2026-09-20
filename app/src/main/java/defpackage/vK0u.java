package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vK0u implements PE_, yu2, fs2, ol4, mi0.QnHx, a90, fu0.CQf {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ vK0u(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.fs2
    public final void a(dr2.QnHx qnHx) {
        int i = this.w;
        int i2 = 1;
        Object obj = this.x;
        switch (i) {
            case 2:
                final o23 o23Var = (o23) obj;
                int i3 = Build.VERSION.SDK_INT;
                Context context = o23Var.a;
                if (i3 < 31) {
                    final k23 k23Var = new k23(new n23(qnHx));
                    TelephonyManager telephonyManager = (TelephonyManager) r80.c(context, TelephonyManager.class);
                    if (telephonyManager != null) {
                        telephonyManager.listen(k23Var, 32);
                    }
                    bm0.m(qnHx, new av3(new um() { // from class: j23
                        @Override // defpackage.um
                        public final void cancel() {
                            TelephonyManager telephonyManager2 = (TelephonyManager) r80.c(o23Var.a, TelephonyManager.class);
                            if (telephonyManager2 != null) {
                                telephonyManager2.listen(k23Var, 0);
                            }
                        }
                    }));
                } else if ((context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0 ? 0 : 1) == 0) {
                    a62.a.l("Read phone state permission granted, can't react to phone calls.");
                    a62.a.g("phone_state_not_granted_for_audio_focus", null);
                } else {
                    final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    final l23 l23Var = new l23(new m23(qnHx));
                    TelephonyManager telephonyManager2 = (TelephonyManager) r80.c(context, TelephonyManager.class);
                    if (telephonyManager2 != null) {
                        telephonyManager2.registerTelephonyCallback(executorServiceNewSingleThreadExecutor, l23Var);
                    }
                    bm0.m(qnHx, new av3(new um() { // from class: i23
                        @Override // defpackage.um
                        public final void cancel() {
                            TelephonyManager telephonyManager3 = (TelephonyManager) r80.c(o23Var.a, TelephonyManager.class);
                            if (telephonyManager3 != null) {
                                telephonyManager3.unregisterTelephonyCallback(l23Var);
                            }
                            executorServiceNewSingleThreadExecutor.shutdown();
                        }
                    }));
                }
                break;
            default:
                rk2 rk2Var = (rk2) obj;
                gu3 gu3Var = new gu3(qnHx);
                rk2Var.q.add(gu3Var);
                syh<kk2> syhVar = rk2Var.g;
                if (!syhVar.isEmpty()) {
                    gu3Var.a(syhVar.last().x);
                }
                bm0.m(qnHx, new av3(new sk5(i2, rk2Var, gu3Var)));
                break;
        }
    }

    @Override // defpackage.PE_
    public final void b(Object obj) {
        ((j81) ((is4) this.x).getValue()).invoke(obj);
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        final ws wsVar = (ws) this.x;
        final sl4 sl4Var = new sl4();
        Context context = wsVar.a;
        bh3 bh3Var = new bh3() { // from class: ts
            @Override // defpackage.bh3
            public final void onPurchasesUpdated(NUlFixed nUl, List list) {
                int i = nUl.a;
                wsVar.b.getClass();
                String strD = fXUx.d(i);
                String str = nUl.b;
                a62 a62Var = a62.a;
                a62Var.c("purchase_response: " + strD + " (" + str + ")");
                a62Var.h("billing", "purchase_response", strD);
                int i2 = nUl.a;
                if (list == null) {
                    list = cs0.w;
                }
                sl4Var.onSuccess(new zc0(list, i2));
            }
        };
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        CQf cQf = new CQf(true, context, bh3Var);
        cQf.j(new vs(qnHx, new ss(cQf), wsVar));
    }

    @Override // mi0.QnHx
    public final void f(pg3 pg3Var) {
        sm smVar = (sm) this.x;
        smVar.getClass();
        kK kKVar = kK.x;
        kKVar.c("AnalyticsConnector now available.");
        CSv cSv = (CSv) pg3Var.get();
        ta2 ta2Var = new ta2(cSv, 16);
        cb0 cb0Var = new cb0();
        UFS ufsC = cSv.c("clx", cb0Var);
        if (ufsC == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            UFS ufsC2 = cSv.c("crash", cb0Var);
            if (ufsC2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            ufsC = ufsC2;
        }
        if (ufsC == null) {
            kKVar.i("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        kKVar.c("Registered Firebase Analytics listener.");
        ny1 ny1Var = new ny1(11);
        eb ebVar = new eb(ta2Var, TimeUnit.MILLISECONDS);
        synchronized (smVar) {
            Iterator it = smVar.c.iterator();
            while (it.hasNext()) {
                ny1Var.b((xe) it.next());
            }
            cb0Var.b = ny1Var;
            cb0Var.a = ebVar;
            smVar.b = ny1Var;
            smVar.a = ebVar;
        }
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        bx bxVar = (bx) this.x;
        a62.a.e("fetched_and_activated");
        ((uw.QnHx) bxVar).b();
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        z05 z05Var = (z05) this.x;
        ExecutorService executorService = tf5.a;
        if (w05Var.n()) {
            z05Var.c(w05Var.k());
            return null;
        }
        Exception excJ = w05Var.j();
        Objects.requireNonNull(excJ);
        z05Var.b(excJ);
        return null;
    }
}
