package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends zzj {
    public final byte[] y;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.y = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] M0() {
        return this.y;
    }
}
