package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class v15 extends dw2.QnHx {
    public final String a;
    public final n80 b;
    public final byte[] c;

    public v15(String str, n80 n80Var) {
        this.a = str;
        this.b = n80Var;
        Charset charsetE = XTd3.e(n80Var);
        charsetE = charsetE == null ? up.a : charsetE;
        Charset charset = up.a;
        this.c = ur1.a(charsetE, charset) ? str.getBytes(charset) : sp.c(charsetE.newEncoder(), str, str.length());
    }

    @Override // defpackage.dw2
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.dw2
    public final n80 b() {
        return this.b;
    }

    @Override // dw2.QnHx
    public final byte[] d() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + pv4.Z(30, this.a) + '\"';
    }
}
