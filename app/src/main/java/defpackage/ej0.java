package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ej0 implements x94<pp1> {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final x81<CharSequence, Integer, uy2<Integer, Integer>> d;

    public static final class QnHx implements Iterator<pp1>, jv1, j$.util.Iterator {
        public int A;
        public int w = -1;
        public int x;
        public int y;
        public pp1 z;

        public QnHx() {
            int iO = AY.o(ej0.this.b, 0, ej0.this.a.length());
            this.x = iO;
            this.y = iO;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0075  */
        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        public final void a() {
            uy2<Integer, Integer> uy2VarInvoke;
            int i = this.y;
            if (i < 0) {
                this.w = 0;
                this.z = null;
                return;
            }
            ej0 ej0Var = ej0.this;
            int i2 = ej0Var.c;
            if (i2 > 0) {
                int i3 = this.A + 1;
                this.A = i3;
                if (i3 >= i2) {
                    this.z = new pp1(this.x, mv4.B(ej0Var.a));
                    this.y = -1;
                } else if (i > ej0Var.a.length() && (uy2VarInvoke = ej0Var.d.invoke(ej0Var.a, Integer.valueOf(this.y))) != null) {
                    int iIntValue = uy2VarInvoke.w.intValue();
                    int iIntValue2 = uy2VarInvoke.x.intValue();
                    this.z = AY.V(this.x, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.x = i4;
                    this.y = i4 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.z = new pp1(this.x, mv4.B(ej0Var.a));
                    this.y = -1;
                }
            } else if (i > ej0Var.a.length()) {
                this.z = new pp1(this.x, mv4.B(ej0Var.a));
                this.y = -1;
            } else {
                int iIntValue3 = uy2VarInvoke.w.intValue();
                int iIntValue4 = uy2VarInvoke.x.intValue();
                this.z = AY.V(this.x, iIntValue3);
                int i5 = iIntValue3 + iIntValue4;
                this.x = i5;
                this.y = i5 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.w = 1;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super pp1> consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.w == -1) {
                a();
            }
            return this.w == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (this.w == -1) {
                a();
            }
            if (this.w == 0) {
                throw new NoSuchElementException();
            }
            pp1 pp1Var = this.z;
            this.z = null;
            this.w = -1;
            return pp1Var;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ej0(CharSequence charSequence, int i, int i2, x81<? super CharSequence, ? super Integer, uy2<Integer, Integer>> x81Var) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = x81Var;
    }

    @Override // defpackage.x94
    public final Iterator<pp1> iterator() {
        return new QnHx();
    }
}
