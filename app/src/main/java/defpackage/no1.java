package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class no1 implements mo1 {
    public final j81<lo1, Boolean> a;
    public final kz2 b;

    public no1(int i, AndroidComposeView.F1 f1) {
        this.a = f1;
        this.b = ps0.R(new lo1(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mo1
    public final int a() {
        return ((lo1) this.b.getValue()).a;
    }
}
