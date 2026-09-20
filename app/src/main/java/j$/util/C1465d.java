package j$.util;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: j$.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1465d implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;
    private final java.util.Map a;
    final Object b;
    private transient Set c;
    private transient Set d;
    private transient java.util.Collection e;

    C1465d(java.util.Map map) {
        map.getClass();
        this.a = map;
        this.b = this;
    }

    private static Set a(Set set, Object obj) {
        if (DesugarCollections.f == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj$default$compute;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$compute = ((Map) map).compute(obj, biFunction);
            } else {
                if (map instanceof ConcurrentMap) {
                    ConcurrentMap concurrentMap = (ConcurrentMap) map;
                    biFunction.getClass();
                    while (true) {
                        Object objPutIfAbsent = concurrentMap.get(obj);
                        while (true) {
                            Object objApply = biFunction.apply(obj, objPutIfAbsent);
                            if (objApply != null) {
                                if (objPutIfAbsent == null) {
                                    objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                                    if (objPutIfAbsent == null) {
                                    }
                                } else if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                }
                                obj$default$compute = objApply;
                            } else if ((objPutIfAbsent == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, objPutIfAbsent)) {
                                obj$default$compute = null;
                            }
                            throw th;
                        }
                    }
                }
                obj$default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.b) {
            objComputeIfAbsent = Map.EL.computeIfAbsent(this.a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj$default$computeIfPresent;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else {
                if (map instanceof ConcurrentMap) {
                    ConcurrentMap concurrentMap = (ConcurrentMap) map;
                    biFunction.getClass();
                    while (true) {
                        Object obj2 = concurrentMap.get(obj);
                        if (obj2 == null) {
                            obj$default$computeIfPresent = obj2;
                            break;
                        }
                        Object objApply = biFunction.apply(obj, obj2);
                        if (objApply != null) {
                            if (concurrentMap.replace(obj, obj2, objApply)) {
                                obj$default$computeIfPresent = objApply;
                                break;
                            }
                        } else if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = null;
                            break;
                        }
                        throw th;
                    }
                }
                obj$default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.b) {
            zContainsValue = this.a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = a(this.a.entrySet(), this.b);
            }
            set = this.d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.a.equals(obj);
        }
        return zEquals;
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.time.a.a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$getOrDefault = ((Map) map).getOrDefault(obj, obj2);
            } else if (map instanceof ConcurrentMap) {
                Object obj3 = ((ConcurrentMap) map).get(obj);
                if (obj3 != null) {
                    obj2 = obj3;
                }
                obj$default$getOrDefault = obj2;
            } else {
                obj$default$getOrDefault = Map.CC.$default$getOrDefault(map, obj, obj2);
            }
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = a(this.a.keySet(), this.b);
            }
            set = this.c;
        }
        return set;
    }

    @Override // j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj$default$merge;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$merge = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                obj2.getClass();
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (objPutIfAbsent == null) {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                        if (objPutIfAbsent == null) {
                            break loop0;
                        }
                    }
                    Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                    if (objApply != null) {
                        if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            obj2 = objApply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                        obj2 = null;
                        break;
                    }
                }
                obj$default$merge = obj2;
            } else {
                obj$default$merge = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj$default$merge;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.b) {
            objPut = this.a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objA;
        synchronized (this.b) {
            objA = Map.EL.a(this.a, obj, obj2);
        }
        return objA;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.b) {
            java.util.Map map = this.a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                j$.util.concurrent.u uVar = new j$.util.concurrent.u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(uVar);
                } else {
                    j$.time.a.a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        java.util.Collection collectionSynchronizedCollection;
        synchronized (this.b) {
            if (this.e == null) {
                java.util.Collection collectionValues = this.a.values();
                Object obj = this.b;
                if (DesugarCollections.e == null) {
                    collectionSynchronizedCollection = Collections.synchronizedCollection(collectionValues);
                } else {
                    try {
                        collectionSynchronizedCollection = (java.util.Collection) DesugarCollections.e.newInstance(collectionValues, obj);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.e = collectionSynchronizedCollection;
            }
            collection = this.e;
        }
        return collection;
    }
}
