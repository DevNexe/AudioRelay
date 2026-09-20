package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class l extends m {
    l() {
        super("", null, null, 0);
    }

    private l(String str, String str2, m mVar) {
        super(str, str2, mVar, 0);
    }

    @Override // j$.time.format.m
    protected final boolean b(char c, char c2) {
        return s.b(c, c2);
    }

    @Override // j$.time.format.m
    protected final m d(String str, String str2, m mVar) {
        return new l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    protected final boolean f(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!s.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
