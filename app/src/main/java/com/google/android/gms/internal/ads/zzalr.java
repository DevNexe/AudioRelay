package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalr extends zzgty {
    public zzalr(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    public final void zzf(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
