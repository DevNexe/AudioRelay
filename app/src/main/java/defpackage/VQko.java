package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class VQko {
    public final ry4 a = new ry4(new NUlFixed());
    public final ry4 b = new ry4(new F1());
    public final ry4 c = new ry4(new YKK());
    public final ry4 d = new ry4(new LPt8Fixed());

    public static final class CQf extends cx1 implements h81<Integer> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            VQko vQko = VQko.this;
            Sb1 sb1A = vQko.a();
            return Integer.valueOf(vQko.b() / ((sb1A.b / 8) * sb1A.c));
        }
    }

    public static final class F1 extends cx1 implements h81<Integer> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            VQko vQko = VQko.this;
            Sb1 sb1A = vQko.a();
            int i = vQko.c().b;
            int i2 = OW8.i(sb1A, i) / vQko.b();
            if (i2 < 1) {
                i2 = 1;
            }
            return Integer.valueOf(i2);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<Long> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Long invoke() {
            VQko vQko = VQko.this;
            return Long.valueOf(OW8.i(vQko.a(), vQko.c().b));
        }
    }

    public static final class NUlFixed extends cx1 implements h81<Integer> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            VQko vQko = VQko.this;
            Sb1 sb1A = vQko.a();
            int i = vQko.c().a;
            return Integer.valueOf(OW8.i(sb1A, i) / vQko.b());
        }
    }

    public static final class QnHx extends cx1 implements h81<Long> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Long invoke() {
            VQko vQko = VQko.this;
            return Long.valueOf(OW8.h(vQko.a(), vQko.b()));
        }
    }

    public static final class YKK extends cx1 implements h81<Long> {
        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final Long invoke() {
            VQko vQko = VQko.this;
            return Long.valueOf(OW8.i(vQko.a(), vQko.c().a));
        }
    }

    public VQko() {
        new ry4(new QnHx());
        new ry4(new CQf());
    }

    public abstract Sb1 a();

    public abstract int b();

    public abstract ad0 c();
}
