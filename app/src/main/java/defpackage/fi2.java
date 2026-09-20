package defpackage;

import androidx.lifecycle.LiveData;

/* JADX INFO: loaded from: classes.dex */
public class fi2<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(T t) {
        LiveData.a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }
}
