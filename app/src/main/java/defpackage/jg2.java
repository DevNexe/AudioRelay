package defpackage;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public final class jg2 implements s0 {
    @Override // defpackage.s0
    public final AudioRecord a(di diVar) {
        return new AudioRecord(diVar.g, diVar.b, diVar.c, diVar.d, diVar.e);
    }
}
