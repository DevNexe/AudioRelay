package defpackage;

import com.azefsw.nativelibrary.player.audio.NativeAudioJni;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ Q(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ww wwVar;
        ve.QnHx qnHx;
        int i = 3;
        switch (this.w) {
            case 0:
                OC oc = (OC) this.x;
                t6r8 t6r8Var = (t6r8) ((VQko) this.y);
                int iOrdinal = t6r8Var.e.ordinal();
                j81<fz4, sAn> j81Var = oc.d;
                if (iOrdinal == 0) {
                    ak2 ak2Var = new ak2(new NativeAudioJni(), t6r8Var, j81Var.invoke(new fz4("OPEN_SL_OUTPUT")));
                    qnHx = new ve.QnHx(new S2cN(ak2Var), ak2Var);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            throw new lp2();
                        }
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new lp2();
                    }
                    m1 m1Var = new m1(0);
                    oc.a.getClass();
                    k1 k1Var = new k1(o1.a(t6r8Var), t6r8Var, oc.b.a(t6r8Var, m1Var), oc.c, j81Var.invoke(new fz4("AUDIO_TRACK_OUTPUT")), m1Var);
                    qnHx = new ve.QnHx(new QD_(k1Var), k1Var);
                }
                return Optional.of(qnHx);
            case 1:
                lfe lfeVar = (lfe) this.x;
                return lfeVar.e.a((di) this.y);
            case 2:
                Qx0$ qx0$ = (Qx0$) ((dc4) this.y).a;
                if (ur1.a(qx0$, Qx0$.QnHx.a)) {
                    return new Sb1(48000, 16, 1);
                }
                if (qx0$ instanceof Qx0$.CQf) {
                    return new Sb1(48000, 16, 2);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                je4 je4Var = (je4) this.x;
                p33 p33Var = (p33) this.y;
                l33 l33Var = new l33(je4Var, new DatagramPacket(new byte[0], 0, InetAddress.getByName(je4Var.n()), p33Var.a.b));
                synchronized (p33Var) {
                    p33Var.d = wu.V0(l33Var, p33Var.d);
                    sd5 sd5Var = sd5.a;
                }
                zr2 zr2Var = p33Var.c;
                z0 z0Var = new z0(2, p33Var, l33Var);
                zr2Var.getClass();
                return new ax(zr2Var, z0Var);
            default:
                final z33 z33Var = (z33) this.x;
                je4 je4Var2 = (je4) this.y;
                synchronized (z33Var) {
                    final j33 j33VarA = z33Var.a(je4Var2);
                    HashMap<j33, pq3> map = z33Var.d.a;
                    pq3 pq3Var = map.get(j33VarA);
                    if (pq3Var == null) {
                        pq3Var = new pq3();
                        map.put(j33VarA, pq3Var);
                    }
                    final pq3 pq3Var2 = pq3Var;
                    je4Var2.c(pq3Var2);
                    p33 p33Var2 = (p33) Map.EL.computeIfAbsent(z33Var.e, j33VarA, new Function() { // from class: y33
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return Function.CC.$default$andThen(this, function);
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            a62 a62Var = a62.a;
                            z33 z33Var2 = z33Var;
                            x33 x33Var = z33Var2.b;
                            return new p33(z33Var2.a, x33Var.a.a.B(new C$(x33Var, j33VarA, pq3Var2, 2)));
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return Function.CC.$default$compose(this, function);
                        }
                    });
                    p33Var2.getClass();
                    wwVar = new ww(new Q(i, je4Var2, p33Var2));
                }
                return wwVar;
        }
    }
}
