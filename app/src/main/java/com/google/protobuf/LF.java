package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class LF {

    public enum CQf {
        x("INT"),
        y("LONG"),
        z("FLOAT"),
        A("DOUBLE"),
        B("BOOLEAN"),
        C("STRING"),
        D("BYTE_STRING"),
        E("ENUM"),
        F("MESSAGE");

        public final Object w;

        CQf(String str) {
            this.w = serializable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class F1 {
        public static final QnHx w;
        public static final CQf x;
        public static final /* synthetic */ F1[] y;

        public static enum CQf extends F1 {
            public CQf() {
                super("STRICT", 1);
            }

            @Override // com.google.protobuf.LF.F1
            public final Object a(NUlFixed nUl) {
                return nUl.y();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.LF$F1$F1, reason: collision with other inner class name */
        public static enum C0096F1 extends F1 {
            public C0096F1() {
                super("LAZY", 2);
            }

            @Override // com.google.protobuf.LF.F1
            public final Object a(NUlFixed nUl) {
                return nUl.h();
            }
        }

        public static enum QnHx extends F1 {
            public QnHx() {
                super("LOOSE", 0);
            }

            @Override // com.google.protobuf.LF.F1
            public final Object a(NUlFixed nUl) {
                return nUl.x();
            }
        }

        static {
            QnHx qnHx = new QnHx();
            w = qnHx;
            CQf cQf = new CQf();
            x = cQf;
            y = new F1[]{qnHx, cQf, new C0096F1()};
        }

        public F1() {
            throw null;
        }

        public F1(String str, int i) {
            super(str, i);
        }

        public static F1 valueOf(String str) {
            return (F1) Enum.valueOf(F1.class, str);
        }

        public static F1[] values() {
            return (F1[]) y.clone();
        }

        public abstract Object a(NUlFixed nUl);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class QnHx {
        public static final /* synthetic */ QnHx[] A;
        public static final CQf y;
        public static final QnHx z;
        public final CQf w;
        public final int x;

        /* JADX INFO: Fake field, exist only in values array */
        QnHx EF0;

        /* JADX INFO: Fake field, exist only in values array */
        QnHx EF1;

        /* JADX INFO: Fake field, exist only in values array */
        QnHx EF2;

        public static enum CQf extends QnHx {
            public CQf(CQf cQf) {
                super("GROUP", 9, cQf, 3);
            }

            @Override // com.google.protobuf.LF.QnHx
            public final boolean a() {
                return false;
            }
        }

        public static enum F1 extends QnHx {
            public F1(CQf cQf) {
                super("MESSAGE", 10, cQf, 2);
            }

            @Override // com.google.protobuf.LF.QnHx
            public final boolean a() {
                return false;
            }
        }

        public static enum LPt8Fixed extends QnHx {
            public LPt8Fixed(CQf cQf) {
                super("BYTES", 11, cQf, 2);
            }

            @Override // com.google.protobuf.LF.QnHx
            public final boolean a() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.LF$QnHx$QnHx, reason: collision with other inner class name */
        public static enum C0097QnHx extends QnHx {
            public C0097QnHx() {
                super("STRING", 8, CQf.C, 2);
            }
        }

        static {
            QnHx qnHx = new QnHx("DOUBLE", 0, CQf.A, 1);
            QnHx qnHx2 = new QnHx("FLOAT", 1, CQf.z, 5);
            CQf cQf = CQf.y;
            QnHx qnHx3 = new QnHx("INT64", 2, cQf, 0);
            QnHx qnHx4 = new QnHx("UINT64", 3, cQf, 0);
            CQf cQf2 = CQf.x;
            QnHx qnHx5 = new QnHx("INT32", 4, cQf2, 0);
            QnHx qnHx6 = new QnHx("FIXED64", 5, cQf, 1);
            QnHx qnHx7 = new QnHx("FIXED32", 6, cQf2, 5);
            QnHx qnHx8 = new QnHx("BOOL", 7, CQf.B, 0);
            C0097QnHx c0097QnHx = new C0097QnHx();
            CQf cQf3 = CQf.F;
            CQf cQf4 = new CQf(cQf3);
            y = cQf4;
            F1 f1 = new F1(cQf3);
            LPt8Fixed lPt8 = new LPt8Fixed(CQf.D);
            QnHx qnHx9 = new QnHx("UINT32", 12, cQf2, 0);
            QnHx qnHx10 = new QnHx("ENUM", 13, CQf.E, 0);
            z = qnHx10;
            A = new QnHx[]{qnHx, qnHx2, qnHx3, qnHx4, qnHx5, qnHx6, qnHx7, qnHx8, c0097QnHx, cQf4, f1, lPt8, qnHx9, qnHx10, new QnHx("SFIXED32", 14, cQf2, 5), new QnHx("SFIXED64", 15, cQf, 1), new QnHx("SINT32", 16, cQf2, 0), new QnHx("SINT64", 17, cQf, 0)};
        }

        public /* synthetic */ QnHx() {
            throw null;
        }

        public QnHx(String str, int i, CQf cQf, int i2) {
            super(str, i);
            this.w = cQf;
            this.x = i2;
        }

        public static QnHx valueOf(String str) {
            return (QnHx) Enum.valueOf(QnHx.class, str);
        }

        public static QnHx[] values() {
            return (QnHx[]) A.clone();
        }

        public boolean a() {
            return !(this instanceof C0097QnHx);
        }
    }

    public static Object a(NUlFixed nUl, QnHx qnHx, F1 f1) {
        switch (qnHx.ordinal()) {
            case 0:
                return Double.valueOf(nUl.i());
            case 1:
                return Float.valueOf(nUl.m());
            case 2:
                return Long.valueOf(nUl.p());
            case 3:
                return Long.valueOf(nUl.B());
            case 4:
                return Integer.valueOf(nUl.o());
            case 5:
                return Long.valueOf(nUl.l());
            case 6:
                return Integer.valueOf(nUl.k());
            case 7:
                return Boolean.valueOf(nUl.g());
            case 8:
                return f1.a(nUl);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return nUl.h();
            case 12:
                return Integer.valueOf(nUl.A());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(nUl.t());
            case 15:
                return Long.valueOf(nUl.u());
            case 16:
                return Integer.valueOf(nUl.v());
            case 17:
                return Long.valueOf(nUl.w());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
