package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class o implements g {
    private final String a;

    o(String str) {
        this.a = str;
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.a;
        return !sVar.r(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
