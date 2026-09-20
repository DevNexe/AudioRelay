package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class F7 {
    public final X1GO a;

    @if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.address.AddressInteractor", f = "AddressInteractor.kt", l = {22}, m = "validateAddress")
    public static final class CQf extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return F7.this.a(null, this);
        }
    }

    @if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.address.AddressInteractor$validateAddress$isResolvable$1", f = "AddressInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super Boolean>, Object> {
        public final /* synthetic */ String A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(String str, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.A = str;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new F1(this.A, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            c2 c2Var = en2.a;
            String str = this.A;
            boolean z = false;
            if (!iv4.s(str)) {
                try {
                    InetAddress.getByName(str);
                    z = true;
                } catch (SecurityException | UnknownHostException unused) {
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super Boolean> z80Var) {
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public static final CQf a = new CQf();
        }

        public static final class F1 extends QnHx {
            public static final F1 a = new F1();
        }

        /* JADX INFO: renamed from: F7$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0003QnHx extends QnHx {
            public static final C0003QnHx a = new C0003QnHx();
        }
    }

    public F7(X1GO x1go) {
        this.a = x1go;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, z80<? super QnHx> z80Var) throws Throwable {
        CQf cQf;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.B = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object objD0 = cQf.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.B;
        if (i2 == 0) {
            C0239D.H(objD0);
            if (iv4.s(str)) {
                return QnHx.C0003QnHx.a;
            }
            fh0 fh0Var = sl0.a;
            F1 f1 = new F1(str, null);
            cQf.B = 1;
            objD0 = fp1.D0(fh0Var, f1, cQf);
            if (objD0 == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objD0);
        }
        return ((Boolean) objD0).booleanValue() ? QnHx.CQf.a : QnHx.F1.a;
    }
}
