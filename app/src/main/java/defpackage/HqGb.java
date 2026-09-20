package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HqGb implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ HqGb(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        final int i = 0;
        switch (this.w) {
            case 0:
                final Ns ns = (Ns) this.x;
                final Context context = (Context) this.y;
                final Vb5 vb5 = (Vb5) obj;
                return new fl4(new tl4(new il4(new Callable(ns, context, vb5) { // from class: o7
                    public final /* synthetic */ Context w;
                    public final /* synthetic */ Vb5 x;

                    {
                        this.w = context;
                        this.x = vb5;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        AdView adView = new AdView(this.w);
                        adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
                        adView.setAdUnitId(this.x.a);
                        return adView;
                    }
                }), Po.a()), new C$(ns, vb5, context, i));
            case 1:
                uy2 uy2Var = (uy2) obj;
                return new bs(((vLEi) this.x).c.b, mv2.ANDROID, GM.a("Android API ", Build.VERSION.SDK_INT), new h04((String) uy2Var.w, ((Boolean) uy2Var.x).booleanValue()), (Sb1) this.y, new Sb1(48000, 16, 2));
            case 2:
                final wd2 wd2Var = (wd2) this.x;
                final c54 c54Var = (c54) this.y;
                return (tx) ((Optional) obj).map(new Function() { // from class: vd2
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        switch (i) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = i;
                        Object obj3 = c54Var;
                        c73 c73Var = wd2Var;
                        switch (i2) {
                            case 0:
                                wd2 wd2Var2 = (wd2) c73Var;
                                c54 c54Var2 = (c54) obj3;
                                s50 s50Var = (s50) obj2;
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                c54 c54Var3 = j54.b;
                                if (timeUnit == null) {
                                    throw new NullPointerException("unit is null");
                                }
                                if (c54Var3 == null) {
                                    throw new NullPointerException("scheduler is null");
                                }
                                hl4 hl4Var = new hl4(new vl4(timeUnit, c54Var3), new i71(3, wd2Var2, c54Var2));
                                J j = new J(wd2Var2, 7);
                                m91.byN byn = m91.d;
                                m91.T23 t23 = m91.c;
                                return new ox(new zr2(new jr2(new jr2(new jr2(hl4Var, j, byn, t23), new rq1(s50Var.b, 4), byn, t23), byn, new jG$(6), t23)));
                            default:
                                final wx2 wx2Var = (wx2) c73Var;
                                final e61 e61Var = (e61) obj3;
                                final s50 s50Var2 = (s50) obj2;
                                return new ww(new Callable() { // from class: tx2
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        final wx2 wx2Var2 = wx2Var;
                                        final a03 a03VarE = wx2Var2.d.e(s50Var2);
                                        final vx2 vx2Var = new vx2(wx2Var2, e61Var);
                                        vq2 vq2VarT = vq2.t(wx2Var2.b.a, wx2Var2.c.a);
                                        m70 m70Var = new m70() { // from class: ux2
                                            @Override // defpackage.m70
                                            public final void accept(Object obj4) {
                                                List<hu4> list;
                                                wx2 wx2Var3 = wx2Var2;
                                                a03 a03Var = a03VarE;
                                                j81<? super List<byte[]>, sd5> j81Var = vx2Var;
                                                hu4 hu4Var = (hu4) obj4;
                                                if (hu4Var.C == 0) {
                                                    return;
                                                }
                                                qx2 qx2Var = wx2Var3.e;
                                                synchronized (qx2Var) {
                                                    hs4 hs4Var = qx2Var.c;
                                                    kq3 kq3Var = qx2Var.b;
                                                    hs4Var.getClass();
                                                    fv0 fv0Var = hu4Var.z < hs4Var.a ? new fv0(cs0.w, hs4Var) : hs4Var.a(kq3Var, hu4Var);
                                                    qx2Var.c = fv0Var.b;
                                                    if (qx2Var.b.b && (!fv0Var.c.isEmpty())) {
                                                        qx2Var.a.a(fv0Var.c);
                                                    }
                                                    list = fv0Var.a;
                                                }
                                                if (!list.isEmpty()) {
                                                    int size = list.size();
                                                    for (int i3 = 0; i3 < size; i3++) {
                                                        a03Var.b(list.get(i3).B.a(), j81Var);
                                                    }
                                                }
                                            }
                                        };
                                        m91.byN byn2 = m91.d;
                                        m91.T23 t24 = m91.c;
                                        vq2VarT.getClass();
                                        return new zr2(new jr2(vq2VarT, m70Var, byn2, t24));
                                    }
                                });
                        }
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        switch (i) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(cx.w);
            case 3:
                sx2 sx2Var = (sx2) this.x;
                return new jr2(sx2Var.a.b().u((c54) this.y), new nm3(3, sx2Var, (VQko) obj), m91.d, m91.c);
            case 4:
                final wx2 wx2Var = (wx2) this.x;
                final e61 e61Var = (e61) this.y;
                final int i2 = 1;
                return (tx) ((Optional) obj).map(new Function() { // from class: vd2
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        switch (i2) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        int i3 = i2;
                        Object obj3 = e61Var;
                        c73 c73Var = wx2Var;
                        switch (i3) {
                            case 0:
                                wd2 wd2Var2 = (wd2) c73Var;
                                c54 c54Var2 = (c54) obj3;
                                s50 s50Var = (s50) obj2;
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                c54 c54Var3 = j54.b;
                                if (timeUnit == null) {
                                    throw new NullPointerException("unit is null");
                                }
                                if (c54Var3 == null) {
                                    throw new NullPointerException("scheduler is null");
                                }
                                hl4 hl4Var = new hl4(new vl4(timeUnit, c54Var3), new i71(3, wd2Var2, c54Var2));
                                J j = new J(wd2Var2, 7);
                                m91.byN byn = m91.d;
                                m91.T23 t23 = m91.c;
                                return new ox(new zr2(new jr2(new jr2(new jr2(hl4Var, j, byn, t23), new rq1(s50Var.b, 4), byn, t23), byn, new jG$(6), t23)));
                            default:
                                final wx2 wx2Var2 = (wx2) c73Var;
                                final e61 e61Var2 = (e61) obj3;
                                final s50 s50Var2 = (s50) obj2;
                                return new ww(new Callable() { // from class: tx2
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        final wx2 wx2Var3 = wx2Var2;
                                        final a03 a03VarE = wx2Var3.d.e(s50Var2);
                                        final vx2 vx2Var = new vx2(wx2Var3, e61Var2);
                                        vq2 vq2VarT = vq2.t(wx2Var3.b.a, wx2Var3.c.a);
                                        m70 m70Var = new m70() { // from class: ux2
                                            @Override // defpackage.m70
                                            public final void accept(Object obj4) {
                                                List<hu4> list;
                                                wx2 wx2Var4 = wx2Var3;
                                                a03 a03Var = a03VarE;
                                                j81<? super List<byte[]>, sd5> j81Var = vx2Var;
                                                hu4 hu4Var = (hu4) obj4;
                                                if (hu4Var.C == 0) {
                                                    return;
                                                }
                                                qx2 qx2Var = wx2Var4.e;
                                                synchronized (qx2Var) {
                                                    hs4 hs4Var = qx2Var.c;
                                                    kq3 kq3Var = qx2Var.b;
                                                    hs4Var.getClass();
                                                    fv0 fv0Var = hu4Var.z < hs4Var.a ? new fv0(cs0.w, hs4Var) : hs4Var.a(kq3Var, hu4Var);
                                                    qx2Var.c = fv0Var.b;
                                                    if (qx2Var.b.b && (!fv0Var.c.isEmpty())) {
                                                        qx2Var.a.a(fv0Var.c);
                                                    }
                                                    list = fv0Var.a;
                                                }
                                                if (!list.isEmpty()) {
                                                    int size = list.size();
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        a03Var.b(list.get(i4).B.a(), j81Var);
                                                    }
                                                }
                                            }
                                        };
                                        m91.byN byn2 = m91.d;
                                        m91.T23 t24 = m91.c;
                                        vq2VarT.getClass();
                                        return new zr2(new jr2(vq2VarT, m70Var, byn2, t24));
                                    }
                                });
                        }
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        switch (i2) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(cx.w);
            case 5:
                return !((Boolean) obj).booleanValue() ? vq2.s(cs0.w) : ((hc4) this.x).b(((B8C) ((v1) this.y).c).D0(j54.b));
            default:
                long jC = zs.QnHx.a.c() - ((df4.CQf) ((df4) this.y)).b;
                if (jC < 1000) {
                    jC = 1000;
                }
                return Long.valueOf(jC);
        }
    }
}
