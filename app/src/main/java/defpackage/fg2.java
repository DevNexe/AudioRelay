package defpackage;

import android.media.audiofx.AudioEffect;

/* JADX INFO: loaded from: classes.dex */
public final class fg2 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ AudioEffect w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg2(AudioEffect audioEffect, int i) {
        super(1);
        this.w = audioEffect;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        a62 a62Var = a62.a;
        this.w.release();
        return sd5.a;
    }
}
