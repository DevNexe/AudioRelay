package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1494n;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1514m {
    public static void f(C c, Consumer consumer) {
        if (consumer instanceof InterfaceC1494n) {
            c.forEachRemaining((InterfaceC1494n) consumer);
        } else {
            if (d0.a) {
                d0.a(c.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            c.forEachRemaining(new C1513l(consumer));
        }
    }

    public static void g(F f, Consumer consumer) {
        if (consumer instanceof j$.util.function.L) {
            f.forEachRemaining((j$.util.function.L) consumer);
        } else {
            if (d0.a) {
                d0.a(f.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            f.forEachRemaining(new C1518q(consumer));
        }
    }

    public static void h(I i, Consumer consumer) {
        if (consumer instanceof InterfaceC1481g0) {
            i.forEachRemaining((InterfaceC1481g0) consumer);
        } else {
            if (d0.a) {
                d0.a(i.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            i.forEachRemaining(new C1632u(consumer));
        }
    }

    public static long i(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean k(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean l(C c, Consumer consumer) {
        if (consumer instanceof InterfaceC1494n) {
            return c.tryAdvance((InterfaceC1494n) consumer);
        }
        if (d0.a) {
            d0.a(c.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return c.tryAdvance(new C1513l(consumer));
    }

    public static boolean m(F f, Consumer consumer) {
        if (consumer instanceof j$.util.function.L) {
            return f.tryAdvance((j$.util.function.L) consumer);
        }
        if (d0.a) {
            d0.a(f.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return f.tryAdvance(new C1518q(consumer));
    }

    public static boolean n(I i, Consumer consumer) {
        if (consumer instanceof InterfaceC1481g0) {
            return i.tryAdvance((InterfaceC1481g0) consumer);
        }
        if (d0.a) {
            d0.a(i.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return i.tryAdvance(new C1632u(consumer));
    }

    public static boolean p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        consumer.getClass();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.p(it.next());
        }
    }

    public static void r(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
            return;
        }
        if (DesugarCollections.b.isInstance(list)) {
            DesugarCollections.e(list, comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static Spliterator s(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            linkedHashSet.getClass();
            return new Z(17, linkedHashSet);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C1637z(sortedSet, sortedSet);
        }
        if (!(collection instanceof Set)) {
            return collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Collection.CC.$default$spliterator(collection);
        }
        Set set = (Set) collection;
        set.getClass();
        return new Z(1, set);
    }

    public static /* synthetic */ java.util.Comparator t(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
