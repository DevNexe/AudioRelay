package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
enum n implements g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            sVar.l(true);
        } else if (iOrdinal == 1) {
            sVar.l(false);
        } else if (iOrdinal == 2) {
            sVar.p(true);
        } else if (iOrdinal == 3) {
            sVar.p(false);
        }
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
