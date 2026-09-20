package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.opus.jni.OpusJni;
import com.azefsw.audioconnect.opus.jni.OpusStartResult;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C$ implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ C$(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [m60] */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i;
        switch (this.w) {
            case 0:
                final Ns ns = (Ns) this.x;
                final Vb5 vb5 = (Vb5) this.y;
                final Context context = (Context) this.z;
                final AdView adView = (AdView) obj;
                return new yk4(new ol4(ns, vb5, context, adView) { // from class: MWk7
                    public final /* synthetic */ Vb5 w;
                    public final /* synthetic */ AdView x;

                    {
                        this.w = vb5;
                        this.x = adView;
                    }

                    @Override // defpackage.ol4
                    public final void c(yk4.QnHx qnHx) {
                        AdRequest adRequestG = kd.g(this.w);
                        AdView adView2 = this.x;
                        adView2.setAdListener(new aJjs(adView2, qnHx));
                        adView2.loadAd(adRequestG);
                    }
                });
            case 1:
                final n60 n60Var = (n60) this.x;
                final e61 e61Var = (e61) this.y;
                final c54 c54Var = (c54) this.z;
                n60.QnHx qnHx = (n60.QnHx) obj;
                n60Var.l.g(Optional.empty());
                if (ur1.a(qnHx, n60.QnHx.C0172QnHx.a)) {
                    xn2 xn2Var = n60Var.d;
                    synchronized (xn2Var) {
                        i = 2;
                        xn2Var.c = 2;
                        xn2Var.c(e61Var, null);
                        sd5 sd5Var = sd5.a;
                    }
                    mn2 mn2Var = (mn2) e61Var.a;
                    jr2 jr2VarA = n60Var.b.a(mn2Var.a, c54Var);
                    jr2VarA.getClass();
                    return new fl4(new mr2(jr2VarA), new i71(i, n60Var, mn2Var)).j();
                }
                if (!(qnHx instanceof n60.QnHx.CQf)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(((mn2) e61Var.a).c.a && n60Var.d.a)) {
                    throw new RuntimeException(((n60.QnHx.CQf) qnHx).a);
                }
                xn2 xn2Var2 = n60Var.d;
                synchronized (xn2Var2) {
                    xn2Var2.c = 4;
                    xn2Var2.c(e61Var, null);
                    sd5 sd5Var2 = sd5.a;
                }
                Throwable th = ((n60.QnHx.CQf) qnHx).a;
                a62.a.c("Starting reconnect attempts...");
                ab2 ab2Var = new ab2(new za2(new Callable() { // from class: m60
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        n60 n60Var2 = n60Var;
                        e61 e61Var2 = e61Var;
                        c54 c54Var2 = c54Var;
                        if (n60Var2.i) {
                            return bb2.w;
                        }
                        mn2 mn2Var2 = (mn2) e61Var2.a;
                        jr2 jr2VarA2 = n60Var2.b.a(mn2Var2.a, c54Var2);
                        jr2VarA2.getClass();
                        fl4 fl4Var = new fl4(new mr2(jr2VarA2), new i71(2, n60Var2, mn2Var2));
                        return fl4Var instanceof o91 ? ((o91) fl4Var).a() : new fb2(fl4Var);
                    }
                }), new fx(new w52(n60Var, 4)));
                l60 l60Var = new l60(n60Var, 1);
                m91.byN byn = m91.d;
                ib2 ib2Var = new ib2(ab2Var, byn, l60Var);
                gq0.QnHx qnHx2 = gq0.x;
                long jO0 = ps0.o0(100, kq0.MILLISECONDS);
                kq0 kq0Var = kq0.SECONDS;
                a14 a14Var = new a14(jO0, ps0.o0(5, kq0Var), ps0.o0(10, kq0Var), c54Var, 1);
                a11 a11VarD = ib2Var instanceof n91 ? ((n91) ib2Var).d() : new mb2(ib2Var);
                a11VarD.getClass();
                t11 t11Var = new t11(new q11(a11VarD, a14Var));
                long jG = gq0.g(((mn2) e61Var.a).c.b);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cb2 cb2Var = new cb2(new wq3(th));
                if (timeUnit == null) {
                    throw new NullPointerException("unit is null");
                }
                ib2 ib2Var2 = new ib2(new ib2(new hb2(new kb2(t11Var, new lb2(Math.max(0L, jG), timeUnit, c54Var), cb2Var), new k71(11)), new J(n60Var, 6), byn), byn, new CY(6));
                return ib2Var2 instanceof p91 ? ((p91) ib2Var2).a() : new nb2(ib2Var2);
            case 2:
                final x33 x33Var = (x33) this.x;
                final j33 j33Var = (j33) this.y;
                final pq3 pq3Var = (pq3) this.z;
                final Sb1 sb1 = (Sb1) obj;
                return new ur2(new Callable() { // from class: s33
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        xq0 qnHx3;
                        xq0 qnHx4;
                        xq0 cQf;
                        yz2 oh2Var;
                        a62 a62Var = a62.a;
                        final j33 j33Var2 = j33Var;
                        j33Var2.toString();
                        Sb1 sb2 = sb1;
                        sb2.toString();
                        BSo.CQf cQf2 = BSo.CQf.a;
                        BSo bSo = j33Var2.a;
                        boolean zA = ur1.a(bSo, cQf2);
                        x33 x33Var2 = x33Var;
                        if (zA) {
                            cQf = new xq0.CQf(null);
                        } else {
                            if (!(bSo instanceof BSo.QnHx)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            BSo.QnHx qnHx5 = (BSo.QnHx) bSo;
                            ed4 ed4Var = x33Var2.d;
                            ed4Var.getClass();
                            try {
                                ed4Var.a.a();
                                qnHx3 = new xq0.CQf(sd5.a);
                            } catch (Throwable th2) {
                                FWT.E(th2);
                                qnHx3 = new xq0.QnHx(th2);
                            }
                            if (qnHx3 instanceof xq0.CQf) {
                                qnHx4 = new xq0.CQf(((xq0.CQf) qnHx3).a);
                            } else {
                                if (!(qnHx3 instanceof xq0.QnHx)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th3 = (Throwable) ((xq0.QnHx) qnHx3).a;
                                a62 a62Var2 = a62.a;
                                a62.a.d(th3, true);
                                qnHx4 = new xq0.QnHx(sj4.QnHx.b);
                            }
                            if (qnHx4 instanceof xq0.CQf) {
                                int i2 = sb2.c;
                                OpusJni opusJni = new OpusJni();
                                int i3 = sb2.a;
                                int i4 = i2 * 2 * (i3 / AdError.NETWORK_ERROR_CODE) * 20;
                                a62 a62Var3 = a62.a;
                                OpusStartResult opusStartResultStartEncoder = opusJni.startEncoder(i3, i2, O.d(qnHx5.b), i4);
                                String[] strArr = opusStartResultStartEncoder.nativeError;
                                bk2 bk2Var = strArr == null ? null : new bk2(strArr[0], strArr[1]);
                                if (bk2Var != null) {
                                    OW8.s(bk2Var);
                                    opusJni.destroyEncoder(opusStartResultStartEncoder.opusPointerRef);
                                    qnHx4 = new xq0.QnHx(new sj4.F1(bk2Var.b));
                                } else {
                                    qnHx4 = new xq0.CQf(Long.valueOf(opusStartResultStartEncoder.opusPointerRef));
                                }
                                if (qnHx4 instanceof xq0.CQf) {
                                    long jLongValue = ((Number) ((xq0.CQf) qnHx4).a).longValue();
                                    String[] encoderBitrate = opusJni.setEncoderBitrate(jLongValue, qnHx5.a);
                                    bk2 bk2Var2 = encoderBitrate != null ? new bk2(encoderBitrate[0], encoderBitrate[1]) : null;
                                    qnHx4 = bk2Var2 != null ? new xq0.QnHx(new sj4.CQf(bk2Var2.b)) : new xq0.CQf(Long.valueOf(jLongValue));
                                } else if (!(qnHx4 instanceof xq0.QnHx)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (qnHx4 instanceof xq0.CQf) {
                                    qnHx4 = new xq0.CQf(new gd4(((Number) ((xq0.CQf) qnHx4).a).longValue(), opusJni, i2, new e8(i4)));
                                } else if (!(qnHx4 instanceof xq0.QnHx)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!(qnHx4 instanceof xq0.QnHx)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cQf = qnHx4;
                        }
                        if (cQf instanceof xq0.CQf) {
                            final dd4 dd4Var = (dd4) ((xq0.CQf) cQf).a;
                            final dz2 dz2Var = new dz2();
                            zz2 zz2Var = x33Var2.c;
                            zz2Var.getClass();
                            l51 l51Var = j33Var2.b;
                            m51 m51Var = l51Var.b;
                            if (ur1.a(m51Var, m51.CQf.a)) {
                                oh2Var = new ddf();
                            } else {
                                if (!(m51Var instanceof m51.QnHx)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m51.QnHx qnHx6 = (m51.QnHx) m51Var;
                                oh2Var = new oh2(qnHx6.b, qnHx6.a);
                            }
                            if (l51Var.a) {
                                HashMap<j33, c03> map = zz2Var.a.a;
                                c03 c03Var = map.get(j33Var2);
                                if (c03Var == null) {
                                    c03Var = new c03();
                                    map.put(j33Var2, c03Var);
                                }
                                oh2Var = new ju4(c03Var, oh2Var, pq3Var);
                            }
                            Gf gf = x33Var2.b;
                            cQf = new xq0.CQf(new ir2(dd4Var == null ? new cs2(gf.b(dz2Var), new j71(5, x33Var2, oh2Var)) : new cs2(gf.b(dz2Var), new C$(x33Var2, dd4Var, oh2Var, 3)), new InterfaceC1443fH() { // from class: t33
                                @Override // defpackage.InterfaceC1443fH
                                public final void run() {
                                    int i5;
                                    boolean z;
                                    a62 a62Var4 = a62.a;
                                    j33Var2.toString();
                                    dd4 dd4Var2 = dd4Var;
                                    if (dd4Var2 != null) {
                                        dd4Var2.close();
                                    }
                                    while (true) {
                                        AtomicReference<ScheduledExecutorService[]> atomicReference = dz2Var.e;
                                        ScheduledExecutorService[] scheduledExecutorServiceArr = atomicReference.get();
                                        ScheduledExecutorService[] scheduledExecutorServiceArr2 = dz2.g;
                                        if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                                            return;
                                        }
                                        while (true) {
                                            if (!atomicReference.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2)) {
                                                if (atomicReference.get() != scheduledExecutorServiceArr) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                z = true;
                                                break;
                                            }
                                        }
                                        if (z) {
                                            for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
                                                scheduledExecutorService.shutdownNow();
                                            }
                                        }
                                    }
                                }
                            }));
                        } else if (!(cQf instanceof xq0.QnHx)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (cQf instanceof xq0.CQf) {
                            return new xq0.CQf(((xq0.CQf) cQf).a);
                        }
                        if (cQf instanceof xq0.QnHx) {
                            return new xq0.QnHx(new r33.QnHx((sj4) ((xq0.QnHx) cQf).a));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                });
            case 3:
                dd4 dd4Var = (dd4) this.y;
                yz2 yz2Var = (yz2) this.z;
                ArrayList arrayList = new ArrayList();
                dd4Var.a((qk) obj, new v33(yz2Var, arrayList));
                return arrayList;
            default:
                return new hr2(new cs2(new cs2(vq2.r(200L, 200L, TimeUnit.MILLISECONDS, (c54) this.x), new HqGb(6, (d7G) this.y, (df4) this.z)), new D((nt4) obj, 27)));
        }
    }
}
