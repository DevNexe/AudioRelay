package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class t70 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ Charset x;
    public final /* synthetic */ rb5 y;
    public final /* synthetic */ fk z;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ Charset x;
        public final /* synthetic */ rb5 y;
        public final /* synthetic */ fk z;

        /* JADX INFO: renamed from: t70$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", l = {224, 224}, m = "emit")
        public static final class C0201QnHx extends b90 {
            public int A;
            public nz0 B;
            public /* synthetic */ Object z;

            public C0201QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, Charset charset, rb5 rb5Var, fk fkVar) {
            this.w = nz0Var;
            this.x = charset;
            this.y = rb5Var;
            this.z = fkVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0201QnHx c0201QnHx;
            nz0 nz0Var;
            if (z80Var instanceof C0201QnHx) {
                c0201QnHx = (C0201QnHx) z80Var;
                int i = c0201QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0201QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0201QnHx = new C0201QnHx(z80Var);
                }
            } else {
                c0201QnHx = new C0201QnHx(z80Var);
            }
            Object obj2 = c0201QnHx.z;
            Object obj3 = va0.COROUTINE_SUSPENDED;
            int i2 = c0201QnHx.A;
            if (i2 != 0) {
                if (i2 == 1) {
                    nz0 nz0Var2 = c0201QnHx.B;
                    C0239D.H(obj2);
                    nz0Var = nz0Var2;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
            C0239D.H(obj2);
            nz0 nz0Var3 = this.w;
            c0201QnHx.B = nz0Var3;
            c0201QnHx.A = 1;
            Object objB = ((s70) obj).b(this.x, this.y, this.z, c0201QnHx);
            if (objB == obj3) {
                return obj3;
            }
            obj2 = objB;
            nz0Var = nz0Var3;
            c0201QnHx.B = null;
            c0201QnHx.A = 2;
            if (nz0Var.f(obj2, c0201QnHx) == obj3) {
                return obj3;
            }
            return sd5.a;
        }
    }

    public t70(pz0 pz0Var, Charset charset, rb5 rb5Var, fk fkVar) {
        this.w = pz0Var;
        this.x = charset;
        this.y = rb5Var;
        this.z = fkVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x, this.y, this.z), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
