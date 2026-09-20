package defpackage;

import com.google.android.gms.internal.measurement.com5Fixed;
import com.google.android.gms.internal.measurement.vDR;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class f27 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static vDR b(Object obj, Object obj2) {
        p17 p17VarH = ((q37) obj).h();
        q37 q37Var = (q37) obj2;
        p17VarH.getClass();
        if (!p17VarH.w.getClass().isInstance(q37Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        p17VarH.k((vDR) ((com5Fixed) q37Var));
        return p17VarH.o();
    }
}
