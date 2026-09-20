package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {744}, m = "invokeSuspend")
public final class zk3 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public bp4 A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ uk3 D;
    public final /* synthetic */ y81<ua0, yg2, z80<? super sd5>, Object> E;
    public final /* synthetic */ yg2 F;

    public static final class CQf extends cx1 implements x81<Set<? extends Object>, cp4, sd5> {
        public final /* synthetic */ uk3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(uk3 uk3Var) {
            super(2);
            this.w = uk3Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(Set<? extends Object> set, cp4 cp4Var) {
            wm<sd5> wmVarU;
            Set<? extends Object> set2 = set;
            uk3 uk3Var = this.w;
            synchronized (uk3Var.d) {
                if (((uk3.F1) uk3Var.o.getValue()).compareTo(uk3.F1.Idle) >= 0) {
                    uk3Var.h.add(set2);
                    wmVarU = uk3Var.u();
                } else {
                    wmVarU = null;
                }
            }
            if (wmVarU != null) {
                wmVarU.x(sd5.a);
            }
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {745}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ y81<ua0, yg2, z80<? super sd5>, Object> C;
        public final /* synthetic */ yg2 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(y81<? super ua0, ? super yg2, ? super z80<? super sd5>, ? extends Object> y81Var, yg2 yg2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = y81Var;
            this.D = yg2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var = (ua0) this.B;
                this.A = 1;
                if (this.C.invoke(ua0Var, this.D, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zk3(uk3 uk3Var, y81<? super ua0, ? super yg2, ? super z80<? super sd5>, ? extends Object> y81Var, yg2 yg2Var, z80<? super zk3> z80Var) {
        super(2, z80Var);
        this.D = uk3Var;
        this.E = y81Var;
        this.F = yg2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        zk3 zk3Var = new zk3(this.D, this.E, this.F, z80Var);
        zk3Var.C = obj;
        return zk3Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00e6 A[EDGE_INSN: B:104:0x00e6->B:54:0x00e6 BREAK  A[LOOP:0: B:50:0x00d2->B:106:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x011e A[EDGE_INSN: B:107:0x011e->B:77:0x011e BREAK  A[LOOP:1: B:72:0x0109->B:109:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6 A[Catch: all -> 0x00e9, TryCatch #2 {, blocks: (B:44:0x00c2, B:46:0x00c6, B:47:0x00c8), top: B:96:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd A[Catch: all -> 0x011f, TryCatch #6 {, blocks: (B:66:0x00f9, B:68:0x00fd, B:69:0x00ff), top: B:102:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ms1 ms1VarB;
        kotlinx.coroutines.flow.QnHx qnHx;
        s13 s13Var;
        q13 q13VarN;
        bp4 bp4Var;
        uk3 uk3Var;
        uk3.CQf cQf;
        kotlinx.coroutines.flow.QnHx qnHx2;
        s13 s13Var2;
        q13 q13VarRemove;
        uk3 uk3Var2;
        uk3.CQf cQf2;
        kotlinx.coroutines.flow.QnHx qnHx3;
        s13 s13Var3;
        q13 q13VarRemove2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bp4Var = this.A;
            ms1VarB = (ms1) this.C;
            try {
                C0239D.H(obj);
                bp4Var.a();
                uk3Var2 = this.D;
                synchronized (uk3Var2.d) {
                    if (uk3Var2.e == ms1VarB) {
                        uk3Var2.e = null;
                    }
                    uk3Var2.u();
                }
                kotlinx.coroutines.flow.QnHx qnHx4 = uk3.q;
                cQf2 = this.D.p;
                do {
                    qnHx3 = uk3.q;
                    s13Var3 = (s13) qnHx3.getValue();
                    q13VarRemove2 = s13Var3.remove((Object) cQf2);
                    if (s13Var3 != q13VarRemove2) {
                        break;
                    }
                } while (!qnHx3.b(s13Var3, q13VarRemove2));
                return sd5.a;
            } catch (Throwable th) {
                th = th;
                bp4Var.a();
                uk3Var = this.D;
                synchronized (uk3Var.d) {
                    if (uk3Var.e == ms1VarB) {
                        uk3Var.e = null;
                    }
                    uk3Var.u();
                }
                kotlinx.coroutines.flow.QnHx qnHx5 = uk3.q;
                cQf = this.D.p;
                do {
                    qnHx2 = uk3.q;
                    s13Var2 = (s13) qnHx2.getValue();
                    q13VarRemove = s13Var2.remove((Object) cQf);
                    if (s13Var2 != q13VarRemove) {
                        break;
                    }
                } while (!qnHx2.b(s13Var2, q13VarRemove));
                throw th;
            }
        }
        C0239D.H(obj);
        ms1VarB = AY.B(((ua0) this.C).g());
        uk3 uk3Var3 = this.D;
        synchronized (uk3Var3.d) {
            Throwable th2 = uk3Var3.f;
            if (th2 != null) {
                throw th2;
            }
            if (((uk3.F1) uk3Var3.o.getValue()).compareTo(uk3.F1.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (uk3Var3.e != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            uk3Var3.e = ms1VarB;
            uk3Var3.u();
        }
        CQf cQf3 = new CQf(this.D);
        ip4.e(ip4.a);
        synchronized (ip4.c) {
            ip4.g.add(cQf3);
        }
        bp4 bp4Var2 = new bp4(cQf3);
        kotlinx.coroutines.flow.QnHx qnHx6 = uk3.q;
        uk3.CQf cQf4 = this.D.p;
        do {
            qnHx = uk3.q;
            s13Var = (s13) qnHx.getValue();
            q13VarN = s13Var.n(cQf4);
            if (s13Var == q13VarN) {
                break;
            }
        } while (!qnHx.b(s13Var, q13VarN));
        try {
            uk3 uk3Var4 = this.D;
            synchronized (uk3Var4.d) {
                ArrayList arrayList = uk3Var4.g;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d90) arrayList.get(i2)).t();
                }
                sd5 sd5Var = sd5.a;
            }
            QnHx qnHx7 = new QnHx(this.E, this.F, null);
            this.C = ms1VarB;
            this.A = bp4Var2;
            this.B = 1;
            if (fp1.R(qnHx7, this) == va0Var) {
                return va0Var;
            }
            bp4Var = bp4Var2;
            bp4Var.a();
            uk3Var2 = this.D;
            synchronized (uk3Var2.d) {
                if (uk3Var2.e == ms1VarB) {
                    uk3Var2.e = null;
                }
                uk3Var2.u();
                kotlinx.coroutines.flow.QnHx qnHx8 = uk3.q;
                cQf2 = this.D.p;
                do {
                    qnHx3 = uk3.q;
                    s13Var3 = (s13) qnHx3.getValue();
                    q13VarRemove2 = s13Var3.remove((Object) cQf2);
                    if (s13Var3 != q13VarRemove2) {
                        break;
                        break;
                    }
                } while (!qnHx3.b(s13Var3, q13VarRemove2));
                return sd5.a;
            }
        } catch (Throwable th3) {
            th = th3;
            bp4Var = bp4Var2;
            bp4Var.a();
            uk3Var = this.D;
            synchronized (uk3Var.d) {
                if (uk3Var.e == ms1VarB) {
                    uk3Var.e = null;
                }
                uk3Var.u();
                kotlinx.coroutines.flow.QnHx qnHx9 = uk3.q;
                cQf = this.D.p;
                do {
                    qnHx2 = uk3.q;
                    s13Var2 = (s13) qnHx2.getValue();
                    q13VarRemove = s13Var2.remove((Object) cQf);
                    if (s13Var2 != q13VarRemove) {
                        break;
                        break;
                    }
                } while (!qnHx2.b(s13Var2, q13VarRemove));
                throw th;
            }
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((zk3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
