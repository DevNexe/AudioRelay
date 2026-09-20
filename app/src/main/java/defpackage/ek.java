package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ek extends pw2 {
    public ek() {
        this(null);
    }

    public ek(Object obj) {
        super(oq.k);
    }

    @Override // defpackage.pw2
    /* JADX INFO: renamed from: c */
    public final pw2 append(char c) {
        super.append(c);
        return this;
    }

    @Override // defpackage.pw2
    /* JADX INFO: renamed from: f */
    public final pw2 append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // defpackage.pw2
    public final void h() {
    }

    @Override // defpackage.pw2
    public final void i() {
    }

    @Override // defpackage.pw2
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ek e(int i, int i2, CharSequence charSequence) {
        return (ek) super.e(i, i2, charSequence);
    }

    public final hk s() {
        int iJ = j();
        oq oqVarN = n();
        if (oqVarN != null) {
            return new hk(oqVarN, iJ, this.w);
        }
        hk hkVar = hk.D;
        return hk.D;
    }

    public final String toString() {
        return "BytePacketBuilder(" + j() + " bytes written)";
    }

    @Override // defpackage.pw2, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // defpackage.pw2, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }
}
