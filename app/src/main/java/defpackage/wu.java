package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class wu extends su {
    public static final <T> boolean B0(Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final double C0(Iterable<Long> iterable) {
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i++;
            if (i < 0) {
                ps0.i0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    public static final List D0(Iterable iterable) {
        ArrayList arrayList;
        Object objN0;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return cs0.w;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objN0 = N0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objN0 = next;
                }
                return Collections.singletonList(objN0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(((List) iterable).get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return ps0.S(arrayList);
    }

    public static final List E0(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return a1(list2, size);
    }

    public static final ArrayList F0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T G0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) H0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T H0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T I0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T J0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void K0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, j81 j81Var) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                ddf.e(sb, obj, j81Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void L0(ArrayList arrayList, StringBuilder sb, String str, dd5 dd5Var, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        K0(arrayList, sb, str, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : null, (i & 16) != 0 ? -1 : 0, (i & 32) != 0 ? "..." : null, (i & 64) != 0 ? null : dd5Var);
    }

    public static String M0(Iterable iterable, String str, String str2, String str3, j81 j81Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i & 16) != 0 ? "..." : null;
        j81 j81Var2 = (i & 32) != 0 ? null : j81Var;
        StringBuilder sb = new StringBuilder();
        K0(iterable, sb, str4, str5, str6, i2, charSequence, j81Var2);
        return sb.toString();
    }

    public static final <T> T N0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ps0.J(list));
    }

    public static final <T> T O0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> T P0(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Float Q0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float R0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final ArrayList S0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(mu.w0(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && ur1.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList T0(op opVar, op opVar2) {
        if (opVar instanceof Collection) {
            return U0(opVar2, (Collection) opVar);
        }
        ArrayList arrayList = new ArrayList();
        su.x0(opVar, arrayList);
        su.x0(opVar2, arrayList);
        return arrayList;
    }

    public static final ArrayList U0(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            su.x0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final ArrayList V0(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final <T> List<T> W0(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return e1(iterable);
        }
        List<T> listF1 = f1(iterable);
        Collections.reverse(listF1);
        return listF1;
    }

    public static final <T> T X0(List<? extends T> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> List<T> Y0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            List<T> listF1 = f1(iterable);
            if (((ArrayList) listF1).size() > 1) {
                Collections.sort(listF1);
            }
            return listF1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return e1(iterable);
        }
        Comparable[] comparableArr = (Comparable[]) collection.toArray(new Comparable[0]);
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(comparableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> Z0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        if (!(iterable instanceof Collection)) {
            List<T> listF1 = f1(iterable);
            if (((ArrayList) listF1).size() > 1) {
                Collections.sort(listF1, comparator);
            }
            return listF1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return e1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static final <T> List<T> a1(Iterable<? extends T> iterable, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(ex0.b("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return cs0.w;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return e1(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(G0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ps0.S(arrayList);
    }

    public static final void b1(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final <T> HashSet<T> c1(Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(C0239D.A(mu.w0(iterable, 12)));
        b1(iterable, hashSet);
        return hashSet;
    }

    public static final int[] d1(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static final <T> List<T> e1(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            return ps0.S(f1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return cs0.w;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> f1(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        b1(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> g1(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> h1(Iterable<? extends T> iterable) {
        boolean z = iterable instanceof Collection;
        hs0 hs0Var = hs0.w;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            b1(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next());
            }
            return hs0Var;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return hs0Var;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(C0239D.A(collection.size()));
        b1(iterable, linkedHashSet2);
        return linkedHashSet2;
    }
}
