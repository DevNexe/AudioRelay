package defpackage;

import com.azefsw.audioconnect.AudioConnectApp;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class qOjh<V> implements Callable {
    public final /* synthetic */ AudioConnectApp w;

    public qOjh(AudioConnectApp audioConnectApp) {
        this.w = audioConnectApp;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AudioConnectApp.QnHx qnHx = this.w.w;
        if (qnHx == null) {
            ur1.e("deps");
            throw null;
        }
        yr4 yr4Var = qnHx.d;
        ArrayList arrayList = yr4Var.b;
        yr4Var.a = true;
        return arrayList;
    }
}
