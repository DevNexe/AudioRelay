package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class PKCr implements Runnable {
    public final /* synthetic */ TextView w;
    public final /* synthetic */ Typeface x;
    public final /* synthetic */ int y;

    public PKCr(TextView textView, Typeface typeface, int i) {
        this.w = textView;
        this.x = typeface;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.setTypeface(this.x, this.y);
    }
}
