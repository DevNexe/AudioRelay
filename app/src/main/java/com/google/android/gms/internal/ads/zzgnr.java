package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnr extends IOException {
    public zzgnr() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgnr(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), indexOutOfBoundsException);
    }

    public zzgnr(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
