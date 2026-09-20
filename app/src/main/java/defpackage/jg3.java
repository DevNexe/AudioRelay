package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class jg3 implements gg5 {
    public boolean a = false;
    public boolean b = false;
    public yw0 c;
    public final gg3 d;

    public jg3(gg3 gg3Var) {
        this.d = gg3Var;
    }

    @Override // defpackage.gg5
    public final gg5 b(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.gg5
    public final gg5 c(boolean z) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
