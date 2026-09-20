package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vn6 extends sn6 implements ListIterator {
    public final /* synthetic */ wn6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn6(wn6 wn6Var) {
        super(wn6Var);
        this.z = wn6Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        wn6 wn6Var = this.z;
        boolean zIsEmpty = wn6Var.isEmpty();
        a();
        ((ListIterator) this.w).add(obj);
        wn6Var.B.A++;
        if (zIsEmpty) {
            wn6Var.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.w).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.w).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.w).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.w).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.w).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn6(wn6 wn6Var, int i) {
        super(wn6Var, ((List) wn6Var.x).listIterator(i));
        this.z = wn6Var;
    }
}
