package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class di3 {
    public final ByteBuffer a;
    public final io.ktor.utils.io.internal.QnHx b;

    public static final class CQf extends di3 {
        public final F1 c;

        public CQf(F1 f1) {
            super(f1.a, f1.b);
            this.c = f1;
        }

        @Override // defpackage.di3
        public final di3 c() {
            return this.c.f;
        }

        @Override // defpackage.di3
        public final di3 d() {
            return this.c.g;
        }

        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    public static final class F1 extends di3 {
        public final ByteBuffer c;
        public final ByteBuffer d;
        public final CQf e;
        public final LPt8Fixed f;
        public final auxFixed g;
        public final NUlFixed h;

        public /* synthetic */ F1(ByteBuffer byteBuffer) {
            this(byteBuffer, 8);
        }

        @Override // defpackage.di3
        public final ByteBuffer a() {
            return this.d;
        }

        @Override // defpackage.di3
        public final ByteBuffer b() {
            return this.c;
        }

        @Override // defpackage.di3
        public final di3 c() {
            return this.f;
        }

        @Override // defpackage.di3
        public final di3 d() {
            return this.g;
        }

        public final String toString() {
            return "Initial";
        }

        public F1(ByteBuffer byteBuffer, int i) {
            super(byteBuffer, new io.ktor.utils.io.internal.QnHx(byteBuffer.capacity() - i));
            if (!(byteBuffer.position() == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(byteBuffer.limit() == byteBuffer.capacity())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.c = byteBuffer.duplicate();
            this.d = byteBuffer.duplicate();
            this.e = new CQf(this);
            this.f = new LPt8Fixed(this);
            this.g = new auxFixed(this);
            this.h = new NUlFixed(this);
        }
    }

    public static final class LPt8Fixed extends di3 {
        public final F1 c;

        public LPt8Fixed(F1 f1) {
            super(f1.a, f1.b);
            this.c = f1;
        }

        @Override // defpackage.di3
        public final ByteBuffer a() {
            return this.c.d;
        }

        @Override // defpackage.di3
        public final di3 d() {
            return this.c.h;
        }

        @Override // defpackage.di3
        public final di3 e() {
            return this.c.e;
        }

        public final String toString() {
            return "Reading";
        }
    }

    public static final class NUlFixed extends di3 {
        public final F1 c;

        public NUlFixed(F1 f1) {
            super(f1.a, f1.b);
            this.c = f1;
        }

        @Override // defpackage.di3
        public final ByteBuffer a() {
            return this.c.d;
        }

        @Override // defpackage.di3
        public final ByteBuffer b() {
            return this.c.c;
        }

        @Override // defpackage.di3
        public final di3 e() {
            return this.c.g;
        }

        @Override // defpackage.di3
        public final di3 f() {
            return this.c.f;
        }

        public final String toString() {
            return "Reading+Writing";
        }
    }

    public static final class QnHx extends di3 {
        public static final QnHx c = new QnHx();

        public QnHx() {
            super(ei3.a, ei3.b);
        }

        public final String toString() {
            return "IDLE(empty)";
        }
    }

    public static final class YKK extends di3 {
        public static final YKK c = new YKK();

        public YKK() {
            super(ei3.a, ei3.b);
        }

        public final String toString() {
            return "Terminated";
        }
    }

    public static final class auxFixed extends di3 {
        public final F1 c;

        public auxFixed(F1 f1) {
            super(f1.a, f1.b);
            this.c = f1;
        }

        @Override // defpackage.di3
        public final ByteBuffer b() {
            return this.c.c;
        }

        @Override // defpackage.di3
        public final di3 c() {
            return this.c.h;
        }

        @Override // defpackage.di3
        public final di3 f() {
            return this.c.e;
        }

        public final String toString() {
            return "Writing";
        }
    }

    public di3(ByteBuffer byteBuffer, io.ktor.utils.io.internal.QnHx qnHx) {
        this.a = byteBuffer;
        this.b = qnHx;
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public di3 c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public di3 d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public di3 e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public di3 f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
