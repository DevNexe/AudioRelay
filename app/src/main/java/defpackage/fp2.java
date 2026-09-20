package defpackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fp2 {
    public static final String a;
    public static final NUlFixed b;
    public static final qr4 c;

    @if0(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", l = {73}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public jo A;
        public ArrayList B;
        public SecureRandom C;
        public SecureRandom D;
        public byte[] E;
        public byte[] F;
        public List G;
        public long H;
        public int I;
        public int J;
        public int K;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0104 A[Catch: all -> 0x012f, TRY_ENTER, TryCatch #4 {all -> 0x012f, blocks: (B:40:0x012b, B:36:0x0104, B:43:0x0131, B:45:0x0140), top: B:66:0x012b }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x0129  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e3 -> B:35:0x0102). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0129 -> B:66:0x012b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fp2.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return new QnHx(z80Var).i(sd5.a);
        }
    }

    static {
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property == null) {
            property = "NativePRNGNonBlocking";
        }
        a = property;
        b = AY.a(1024, null, 6);
        ta0 ta0Var = new ta0("nonce-generator");
        ha1 ha1Var = ha1.w;
        fh0 fh0Var = rl0.c;
        bp2 bp2Var = bp2.x;
        fh0Var.getClass();
        c = fp1.j0(ha1Var, la0.QnHx.a(fh0Var, bp2Var).g0(ta0Var), 2, new QnHx(null));
    }
}
