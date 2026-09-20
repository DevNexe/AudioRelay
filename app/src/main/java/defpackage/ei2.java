package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei2<T> implements yq1<T> {
    public final ui2<yq1.QnHx<T>> a = new ui2<>(new yq1.QnHx[16]);
    public int b;
    public yq1.QnHx<T> c;

    @Override // defpackage.yq1
    public final int a() {
        return this.b;
    }

    public final void b(int i) {
        boolean z = false;
        if (i >= 0 && i < this.b) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbC = iZUl.c("Index ", i, ", size ");
        sbC.append(this.b);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final void c(int i, int i2, q02 q02Var) {
        b(i);
        b(i2);
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        ui2<yq1.QnHx<T>> ui2Var = this.a;
        int iD = X.d(i, ui2Var);
        int i3 = ui2Var.w[iD].a;
        while (i3 <= i2) {
            yq1.QnHx<j02> qnHx = ui2Var.w[iD];
            q02Var.invoke(qnHx);
            i3 += qnHx.b;
            iD++;
        }
    }

    @Override // defpackage.yq1
    public final yq1.QnHx<T> get(int i) {
        b(i);
        yq1.QnHx<T> qnHx = this.c;
        if (qnHx != null) {
            int i2 = qnHx.b;
            int i3 = qnHx.a;
            if (i < i2 + i3 && i3 <= i) {
                return qnHx;
            }
        }
        ui2<yq1.QnHx<T>> ui2Var = this.a;
        yq1.QnHx<T> qnHx2 = ui2Var.w[X.d(i, ui2Var)];
        this.c = qnHx2;
        return qnHx2;
    }
}
