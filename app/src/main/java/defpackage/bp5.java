package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class bp5 {
    public static final byte[] a = kd.a("0123456789abcdef");

    public static final String a(gg ggVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (ggVar.h(j2) == ((byte) 13)) {
                String strW = ggVar.w(j2, up.a);
                ggVar.skip(2L);
                return strW;
            }
        }
        ggVar.getClass();
        String strW2 = ggVar.w(j, up.a);
        ggVar.skip(1L);
        return strW2;
    }
}
