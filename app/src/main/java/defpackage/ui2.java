package defpackage;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ui2<T> implements RandomAccess {
    public T[] w;
    public QnHx x;
    public int y = 0;

    public static final class CQf<T> implements List<T>, lv1 {
        public final List<T> w;
        public final int x;
        public int y;

        public CQf(int i, int i2, List list) {
            this.w = list;
            this.x = i;
            this.y = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.y;
            this.y = i + 1;
            this.w.add(i, t);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            this.w.addAll(i + this.x, collection);
            this.y = collection.size() + this.y;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.y - 1;
            int i2 = this.x;
            if (i2 <= i) {
                while (true) {
                    this.w.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.y = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.y;
            for (int i2 = this.x; i2 < i; i2++) {
                if (ur1.a(this.w.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            fp1.o(this, i);
            return this.w.get(i + this.x);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.y;
            int i2 = this.x;
            for (int i3 = i2; i3 < i; i3++) {
                if (ur1.a(this.w.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.y == this.x;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new F1(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.y - 1;
            int i2 = this.x;
            if (i2 > i) {
                return -1;
            }
            while (!ur1.a(this.w.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new F1(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.y;
            for (int i2 = this.x; i2 < i; i2++) {
                List<T> list = this.w;
                if (ur1.a(list.get(i2), obj)) {
                    list.remove(i2);
                    this.y--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            int i = this.y;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.y;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            int i = this.y;
            int i2 = i - 1;
            int i3 = this.x;
            if (i3 <= i2) {
                while (true) {
                    List<T> list = this.w;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.y--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.y;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            fp1.o(this, i);
            return this.w.set(i + this.x, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.y - this.x;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            fp1.p(i, i2, this);
            return new CQf(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return AY.Q(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AY.R(this, tArr);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.w.add(i + this.x, t);
            this.y++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new F1(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.w.addAll(this.y, collection);
            this.y = collection.size() + this.y;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            fp1.o(this, i);
            T tRemove = this.w.remove(i + this.x);
            this.y--;
            return tRemove;
        }
    }

    public static final class F1<T> implements ListIterator<T>, jv1, j$.util.Iterator {
        public final List<T> w;
        public int x;

        public F1(List<T> list, int i) {
            this.w = list;
            this.x = i;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            this.w.add(this.x, t);
            this.x++;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.x < this.w.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.x > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            int i = this.x;
            this.x = i + 1;
            return this.w.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.x;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.x - 1;
            this.x = i;
            return this.w.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.x - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            int i = this.x - 1;
            this.x = i;
            this.w.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.w.set(this.x, t);
        }
    }

    public static final class QnHx<T> implements List<T>, lv1 {
        public final ui2<T> w;

        public QnHx(ui2<T> ui2Var) {
            this.w = ui2Var;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.w.b(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            ui2<T> ui2Var = this.w;
            return ui2Var.d(ui2Var.y, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.w.e();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.w.f(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            ui2<T> ui2Var = this.w;
            ui2Var.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!ui2Var.f(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            fp1.o(this, i);
            return this.w.w[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.w.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.w.j();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new F1(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            ui2<T> ui2Var = this.w;
            int i = ui2Var.y;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = ui2Var.w;
            while (!ur1.a(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new F1(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.w.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            ui2<T> ui2Var = this.w;
            ui2Var.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = ui2Var.y;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ui2Var.l(it.next());
            }
            return i != ui2Var.y;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            ui2<T> ui2Var = this.w;
            int i = ui2Var.y;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(ui2Var.w[i2])) {
                    ui2Var.n(i2);
                }
            }
            return i != ui2Var.y;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            fp1.o(this, i);
            T[] tArr = this.w.w;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.w.y;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            fp1.p(i, i2, this);
            return new CQf(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return AY.Q(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AY.R(this, tArr);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.w.a(i, t);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new F1(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            fp1.o(this, i);
            return this.w.n(i);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            return this.w.d(i, collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ui2(Object[] objArr) {
        this.w = objArr;
    }

    public final void a(int i, T t) {
        g(this.y + 1);
        T[] tArr = this.w;
        int i2 = this.y;
        if (i != i2) {
            System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
        }
        tArr[i] = t;
        this.y++;
    }

    public final void b(Object obj) {
        g(this.y + 1);
        Object[] objArr = (T[]) this.w;
        int i = this.y;
        objArr[i] = obj;
        this.y = i + 1;
    }

    public final void c(int i, ui2 ui2Var) {
        if (ui2Var.j()) {
            return;
        }
        g(this.y + ui2Var.y);
        T[] tArr = this.w;
        int i2 = this.y;
        if (i != i2) {
            System.arraycopy(tArr, i, tArr, ui2Var.y + i, i2 - i);
        }
        System.arraycopy(ui2Var.w, 0, tArr, i, ui2Var.y - 0);
        this.y += ui2Var.y;
    }

    public final boolean d(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        g(collection.size() + this.y);
        T[] tArr = this.w;
        if (i != this.y) {
            System.arraycopy(tArr, i, tArr, collection.size() + i, this.y - i);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ps0.j0();
                throw null;
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.y = collection.size() + this.y;
        return true;
    }

    public final void e() {
        T[] tArr = this.w;
        int i = this.y;
        while (true) {
            i--;
            if (-1 >= i) {
                this.y = 0;
                return;
            }
            tArr[i] = null;
        }
    }

    public final boolean f(T t) {
        int i = this.y - 1;
        if (i >= 0) {
            for (int i2 = 0; !ur1.a(this.w[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i) {
        T[] tArr = this.w;
        if (tArr.length < i) {
            this.w = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
        }
    }

    public final int h(T t) {
        int i = this.y;
        if (i <= 0) {
            return -1;
        }
        T[] tArr = this.w;
        int i2 = 0;
        while (!ur1.a(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean j() {
        return this.y == 0;
    }

    public final boolean k() {
        return this.y != 0;
    }

    public final boolean l(T t) {
        int iH = h(t);
        if (iH < 0) {
            return false;
        }
        n(iH);
        return true;
    }

    public final void m(ui2 ui2Var) {
        int i = ui2Var.y - 1;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            l(ui2Var.w[i2]);
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final T n(int i) {
        T[] tArr = this.w;
        T t = tArr[i];
        int i2 = this.y;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(tArr, i3, tArr, i, i2 - i3);
        }
        int i4 = this.y - 1;
        this.y = i4;
        tArr[i4] = null;
        return t;
    }
}
