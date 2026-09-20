package defpackage;

import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.utils.io.charsets.MalformedInputException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {39, 45}, m = "invokeSuspend")
public final class lh0 extends px4 implements x81<qg1, z80<? super sd5>, Object> {
    public int A;
    public int B;
    public /* synthetic */ Object C;

    public lh0(z80<? super lh0> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        lh0 lh0Var = new lh0(z80Var);
        lh0Var.C = obj;
        return lh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        int i;
        qg1 qg1VarE;
        int i2;
        qg1 qg1Var;
        String str;
        boolean z;
        boolean z2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = this.B;
        try {
            if (i3 == 0) {
                C0239D.H(obj);
                qg1 qg1Var2 = (qg1) this.C;
                if (!((Boolean) qg1Var2.c().getAttributes().e(te1.a)).booleanValue()) {
                    return sd5.a;
                }
                i = qg1Var2.i().a;
                ve1 ve1VarC = qg1Var2.c();
                if (i < 300 || ve1VarC.getAttributes().c(nh0.a)) {
                    return sd5.a;
                }
                this.A = i;
                this.B = 1;
                obj = p24.a(ve1VarC, this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.A;
                    qg1Var = (qg1) this.C;
                    try {
                        C0239D.H(obj);
                        str = (String) obj;
                    } catch (MalformedInputException unused) {
                        str = "<body failed decoding>";
                    }
                    if (300 <= i2 || i2 >= 400) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        throw new RedirectResponseException(qg1Var, str);
                    }
                    if (400 <= i2 || i2 >= 500) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new ClientRequestException(qg1Var, str);
                    }
                    if (500 > i2 && i2 < 600) {
                        throw new ServerResponseException(qg1Var, str);
                    }
                    throw new ResponseException(qg1Var, str);
                }
                i = this.A;
                C0239D.H(obj);
            }
            this.C = qg1VarE;
            this.A = i;
            this.B = 2;
            Object objA = tg1.a(qg1VarE, up.a, this);
            if (objA == va0Var) {
                return va0Var;
            }
            i2 = i;
            qg1Var = qg1VarE;
            obj = objA;
            str = (String) obj;
            if (300 <= i2) {
                z = false;
            } else {
                z = false;
            }
            if (!z) {
                throw new RedirectResponseException(qg1Var, str);
            }
            if (400 <= i2) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new ClientRequestException(qg1Var, str);
            }
            if (500 > i2 && i2 < 600) {
                throw new ServerResponseException(qg1Var, str);
            }
            throw new ResponseException(qg1Var, str);
        } catch (MalformedInputException unused2) {
            i2 = i;
            qg1Var = qg1VarE;
            str = "<body failed decoding>";
        }
        ve1 ve1Var = (ve1) obj;
        ve1Var.getAttributes().a(nh0.a, sd5.a);
        qg1VarE = ve1Var.e();
    }

    @Override // defpackage.x81
    public final Object invoke(qg1 qg1Var, z80<? super sd5> z80Var) {
        return ((lh0) a(qg1Var, z80Var)).i(sd5.a);
    }
}
