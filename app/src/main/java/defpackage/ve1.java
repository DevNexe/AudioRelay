package defpackage;

import io.ktor.client.call.DoubleReceiveException;
import io.ktor.client.call.NoTransformationFoundException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public class ve1 implements ua0 {
    public static final Dt<Object> A = new Dt<>("CustomResponse");
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(ve1.class, "received");
    private volatile /* synthetic */ int received = 0;
    public final ue1 w;
    public gg1 x;
    public qg1 y;

    @if0(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {85, 88}, m = "bodyNullable")
    public static final class QnHx extends b90 {
        public rb5 A;
        public /* synthetic */ Object B;
        public int D;
        public ve1 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return ve1.this.a(null, this);
        }
    }

    public ve1(ue1 ue1Var) {
        this.w = ue1Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rb5 rb5Var, z80<Object> z80Var) throws Throwable {
        QnHx qnHx;
        ve1 ve1Var;
        ve1 ve1Var2;
        Object obj;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objD = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 == 0) {
            C0239D.H(objD);
            try {
                if (JvmClassMappingKt.getJavaClass((fv1) rb5Var.a).isInstance(e())) {
                    qg1 qg1VarE = e();
                    tg1.b(e());
                    return qg1VarE;
                }
                if (!c() && !z.compareAndSet(this, 0, 1)) {
                    throw new DoubleReceiveException(this);
                }
                objD = getAttributes().d(A);
                if (objD == null) {
                    qnHx.z = this;
                    qnHx.A = rb5Var;
                    qnHx.D = 1;
                    objD = h();
                    if (objD == va0Var) {
                        return va0Var;
                    }
                }
                ve1Var2 = this;
            } catch (Throwable th) {
                th = th;
                ve1Var = this;
                fp1.H(ve1Var.e(), ps0.b("Receive failed", th));
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb5Var = qnHx.A;
                ve1Var = qnHx.z;
                try {
                    C0239D.H(objD);
                    obj = ((rg1) objD).b;
                    if (!ur1.a(obj, kd.A)) {
                        obj = null;
                    }
                    if (obj != null && !JvmClassMappingKt.getJavaClass((fv1) rb5Var.a).isInstance(obj)) {
                        throw new NoTransformationFoundException(ve1Var.e(), nl3.a(obj.getClass()), rb5Var.a);
                    }
                    tg1.b(ve1Var.e());
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fp1.H(ve1Var.e(), ps0.b("Receive failed", th));
                        throw th;
                    } catch (Throwable th3) {
                        tg1.b(ve1Var.e());
                        throw th3;
                    }
                }
            }
            rb5Var = qnHx.A;
            ve1Var2 = qnHx.z;
            try {
                C0239D.H(objD);
            } catch (Throwable th4) {
                th = th4;
                ve1Var = ve1Var2;
                fp1.H(ve1Var.e(), ps0.b("Receive failed", th));
                throw th;
            }
        }
        rg1 rg1Var = new rg1(rb5Var, objD);
        ug1 ug1Var = ve1Var2.w.B;
        qnHx.z = ve1Var2;
        qnHx.A = rb5Var;
        qnHx.D = 2;
        objD = ug1Var.a(ve1Var2, rg1Var, qnHx);
        if (objD == va0Var) {
            return va0Var;
        }
        ve1Var = ve1Var2;
        obj = ((rg1) objD).b;
        if (!ur1.a(obj, kd.A)) {
            obj = null;
        }
        if (obj != null) {
            throw new NoTransformationFoundException(ve1Var.e(), nl3.a(obj.getClass()), rb5Var.a);
        }
        tg1.b(ve1Var.e());
        return obj;
    }

    public boolean c() {
        return false;
    }

    public final gg1 d() {
        gg1 gg1Var = this.x;
        if (gg1Var != null) {
            return gg1Var;
        }
        ur1.e("request");
        throw null;
    }

    public final qg1 e() {
        qg1 qg1Var = this.y;
        if (qg1Var != null) {
            return qg1Var;
        }
        ur1.e("response");
        throw null;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return e().g();
    }

    public final Bpm getAttributes() {
        return d().getAttributes();
    }

    public Object h() {
        return e().d();
    }

    public final String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().i() + ']';
    }
}
