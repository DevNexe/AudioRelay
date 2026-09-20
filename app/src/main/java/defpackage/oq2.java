package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class oq2 {
    public static final int a;
    public static final al0 b;
    public static final CQf c;
    public static final QnHx d;

    public static final class CQf extends jh0<di3.F1> {
        public CQf(int i) {
            super(i);
        }

        @Override // defpackage.jh0
        public final void f(di3.F1 f1) {
            oq2.b.p0(f1.a);
        }

        @Override // defpackage.jh0
        public final di3.F1 g() {
            return new di3.F1(oq2.b.B());
        }
    }

    public static final class QnHx extends qo2<di3.F1> {
        @Override // defpackage.nq2
        public final Object B() {
            return new di3.F1(ByteBuffer.allocateDirect(oq2.a));
        }
    }

    static {
        int I = ps0.I(4096, "BufferSize");
        a = I;
        int I2 = ps0.I(2048, "BufferPoolSize");
        int I3 = ps0.I(1024, "BufferObjectPoolSize");
        b = new al0(I2, I);
        c = new CQf(I3);
        d = new QnHx();
    }
}
