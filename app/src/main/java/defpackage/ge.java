package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class ge implements bj1 {
    public final Bitmap a;

    public ge(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.bj1
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.bj1
    public final int getWidth() {
        return this.a.getWidth();
    }
}
