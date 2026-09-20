package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j71 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ j71(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                final o71 o71Var = (o71) obj2;
                final x61 x61Var = (x61) obj;
                ds2 ds2VarF = o71Var.c.f((c54) obj3);
                ds2VarF.getClass();
                return new pr2(new pr2(new cs2(new pr2(new rs2(ds2VarF), new m71(0)), new KnU(3)), new n71(0)), new pa3(o71Var, x61Var) { // from class: l71
                    public final /* synthetic */ x61 w;

                    {
                        this.w = x61Var;
                    }

                    @Override // defpackage.pa3
                    public final boolean test(Object obj4) {
                        return ((y73.NUlFixed) obj4).c > gq0.g(this.w.a);
                    }
                });
            case 1:
                return ((SfnP) obj2).a((Context) obj3);
            case 2:
                Throwable th = (Throwable) obj;
                ((gy0) obj2).getClass();
                if (gy0.a((cy0) obj3)) {
                    a62.a.e("ignoring_error");
                    return cx.w;
                }
                if (th != null) {
                    return new ex(th);
                }
                throw new NullPointerException("error is null");
            case 3:
                final wk5 wk5Var = (wk5) obj2;
                final c54 c54Var = (c54) obj3;
                return (us2) ((Optional) obj).map(new Function() { // from class: uk5
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj4) {
                        wk5 wk5Var2 = wk5Var;
                        tk5 tk5Var = wk5Var2.b;
                        tk5Var.getClass();
                        us2 us2VarX = new cs2(new dr2(new im3(tk5Var, 4)).n(new k71(9)).u(c54Var), new D(wk5Var2, 10)).x(wk5Var2.a());
                        us2VarX.getClass();
                        return new hr2(us2VarX);
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(or2.w);
            case 4:
                final md2 md2Var = (md2) obj2;
                final c54 c54Var2 = (c54) obj3;
                return (tx) ((Optional) obj).map(new Function() { // from class: ld2
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj4) {
                        md2 md2Var2 = md2Var;
                        return kd.x(new qd2(c54Var2, (s50) obj4, md2Var2, null));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(cx.w);
            case 5:
                ArrayList arrayList = new ArrayList();
                ((yz2) obj3).a((qk) obj, new w33(arrayList));
                return arrayList;
            case 6:
                re4 re4Var = (re4) obj2;
                ps psVar = (ps) obj;
                vq2 vq2VarP = new gr2(new sc4(2, re4Var, psVar)).p(new NFo7(re4Var, 28), Integer.MAX_VALUE);
                ke4 ke4Var = new ke4(re4Var, (dc4) obj3, psVar);
                vq2VarP.getClass();
                sr2 sr2Var = new sr2(vq2VarP, ke4Var);
                xW8n xw8n = new xW8n(psVar, 8);
                m91.byN byn = m91.d;
                return new rx(sr2Var, byn, byn, m91.c, xw8n);
            default:
                d7G d7g = (d7G) obj2;
                c54 c54Var3 = (c54) obj3;
                df4 df4Var = (df4) obj;
                return !(df4Var instanceof df4.CQf) ? or2.w : ((ot4) d7g.y).a(c54Var3).B(new C$(c54Var3, d7g, df4Var, 4)).x("");
        }
    }
}
