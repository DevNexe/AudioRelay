package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h80 {
    public static final CQf c = new CQf();
    public static final Dt<h80> d = new Dt<>("ContentNegotiation");
    public final List<QnHx.C0136QnHx> a;
    public final Set<fv1<?>> b;

    public static final class CQf implements kf1<QnHx, h80> {
        @Override // defpackage.kf1
        public final void a(h80 h80Var, ue1 ue1Var) {
            h80 h80Var2 = h80Var;
            ue1Var.A.f(pg1.h, new j80(h80Var2, null));
            ue1Var.B.f(ug1.h, new k80(h80Var2, null));
        }

        @Override // defpackage.kf1
        public final h80 b(j81<? super QnHx, sd5> j81Var) {
            QnHx qnHx = new QnHx();
            j81Var.invoke(qnHx);
            return new h80(qnHx.b, qnHx.a);
        }

        @Override // defpackage.kf1
        public final Dt<h80> getKey() {
            return h80.d;
        }
    }

    @if0(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", l = {156}, m = "convertRequest$ktor_client_content_negotiation")
    public static final class F1 extends b90 {
        public Object A;
        public n80 B;
        public List C;
        public Iterator D;
        public /* synthetic */ Object E;
        public int G;
        public ig1 z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return h80.this.a(null, null, this);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<QnHx.C0136QnHx, CharSequence> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final CharSequence invoke(QnHx.C0136QnHx c0136QnHx) {
            return c0136QnHx.a.toString();
        }
    }

    public static final class QnHx {
        public final Set<fv1<?>> a = wu.g1(og4.c0(dh0.a, l80.a));
        public final ArrayList b = new ArrayList();

        /* JADX INFO: renamed from: h80$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0136QnHx {
            public final s70 a;
            public final n80 b;
            public final o80 c;

            public C0136QnHx(xw1 xw1Var, n80 n80Var, o80 o80Var) {
                this.a = xw1Var;
                this.b = n80Var;
                this.c = o80Var;
            }
        }

        public final void a(n80 n80Var, xw1 xw1Var, j81 j81Var) {
            o80 i80Var = ur1.a(n80Var, n80.QnHx.a) ? FNO9.z : new i80(n80Var);
            j81Var.invoke(xw1Var);
            this.b.add(new C0136QnHx(xw1Var, n80Var, i80Var));
        }
    }

    public h80(ArrayList arrayList, Set set) {
        this.a = arrayList;
        this.b = set;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.ig1 r18, java.lang.Object r19, defpackage.z80<java.lang.Object> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.a(ig1, java.lang.Object, z80):java.lang.Object");
    }
}
