package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import defpackage.d96;
import defpackage.e96;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzciu extends Thread implements SurfaceTexture.OnFrameAvailableListener, d96 {
    public static final float[] X = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public final float[] D;
    public float E;
    public float F;
    public float G;
    public int H;
    public int I;
    public SurfaceTexture J;
    public SurfaceTexture K;
    public int L;
    public int M;
    public int N;
    public final FloatBuffer O;
    public final CountDownLatch P;
    public final Object Q;
    public EGL10 R;
    public EGLDisplay S;
    public EGLContext T;
    public EGLSurface U;
    public volatile boolean V;
    public volatile boolean W;
    public final e96 w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    public zzciu(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.O = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(X).position(0);
        this.x = new float[9];
        this.y = new float[9];
        this.z = new float[9];
        this.A = new float[9];
        this.B = new float[9];
        this.C = new float[9];
        this.D = new float[9];
        this.E = Float.NaN;
        e96 e96Var = new e96(context);
        this.w = e96Var;
        e96Var.h = this;
        this.P = new CountDownLatch(1);
        this.Q = new Object();
    }

    public static final void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    public static final void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = (f4 * f9) + (f2 * f8) + f7;
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = (f4 * f13) + (f11 * f12) + f10;
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = (f3 * f16) + (f14 * f15);
        float f18 = fArr2[5];
        fArr[3] = (f18 * f5) + f17;
        float f19 = fArr2[3];
        float f20 = fArr3[1];
        float f21 = f16 * f8;
        fArr[4] = (f18 * f9) + f21 + (f19 * f20);
        float f22 = fArr3[2];
        float f23 = f18 * f13;
        fArr[5] = f23 + (fArr2[4] * f12) + (f19 * f22);
        float f24 = fArr2[6] * f15;
        float f25 = fArr2[7];
        float f26 = (fArr3[3] * f25) + f24;
        float f27 = fArr2[8];
        fArr[6] = (f5 * f27) + f26;
        float f28 = fArr2[6];
        float f29 = f9 * f27;
        fArr[7] = f29 + (f25 * fArr3[4]) + (f20 * f28);
        float f30 = f27 * f13;
        fArr[8] = f30 + (fArr2[7] * fArr3[5]) + (f28 * f22);
    }

    public static final void d(float f, float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void e(float f, float[] fArr) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        b("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            b("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            b("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            b("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                b("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.U;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.R.eglMakeCurrent(this.S, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.R.eglDestroySurface(this.S, this.U);
            this.U = null;
        }
        EGLContext eGLContext = this.T;
        if (eGLContext != null) {
            this.R.eglDestroyContext(this.S, eGLContext);
            this.T = null;
        }
        EGLDisplay eGLDisplay = this.S;
        if (eGLDisplay != null) {
            this.R.eglTerminate(eGLDisplay);
            this.S = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.N++;
        synchronized (this.Q) {
            this.Q.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.K == null) {
            zzcgn.zzg("SphericalVideoProcessor started with no output texture.");
            this.P.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.R = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.S = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            z = false;
        } else {
            if (this.R.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.R.eglChooseConfig(this.S, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig == null) {
                    z = false;
                } else {
                    EGLContext eGLContextEglCreateContext = this.R.eglCreateContext(this.S, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.T = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
                        z = false;
                    } else {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.R.eglCreateWindowSurface(this.S, eGLConfig, this.K, null);
                        this.U = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.R.eglMakeCurrent(this.S, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.T)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                }
            } else {
                z = false;
            }
        }
        zzbiq zzbiqVar = zzbiy.zzbc;
        int iF = f(35633, !((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).equals(zzbiqVar.zzm()) ? (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iF == 0) {
            iGlCreateProgram = 0;
        } else {
            zzbiq zzbiqVar2 = zzbiy.zzbd;
            int iF2 = f(35632, !((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2)).equals(zzbiqVar2.zzm()) ? (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iF2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                b("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iF);
                    b("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iF2);
                    b("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    b("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    b("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        b("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        b("validateProgram");
                    }
                }
            }
        }
        this.L = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        b("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.L, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.O);
        b("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        b("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        b("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        b("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        b("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        b("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        b("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.L, "uVMat");
        this.M = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.L;
        if (!z || i2 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.R.eglGetError())));
            zzcgn.zzg(strConcat);
            com.google.android.gms.ads.internal.zzt.zzp().zzt(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            a();
            this.P.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.J = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.P.countDown();
        e96 e96Var = this.w;
        if (e96Var.g == null) {
            SensorManager sensorManager = e96Var.a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzcgn.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                zzfph zzfphVar = new zzfph(handlerThread.getLooper());
                e96Var.g = zzfphVar;
                if (!sensorManager.registerListener(e96Var, defaultSensor, 0, zzfphVar)) {
                    zzcgn.zzg("SensorManager.registerListener failed.");
                    e96Var.a();
                }
            }
        }
        try {
            try {
                this.V = true;
                while (!this.W) {
                    while (this.N > 0) {
                        this.J.updateTexImage();
                        this.N--;
                    }
                    if (this.w.b(this.x)) {
                        if (Float.isNaN(this.E)) {
                            float[] fArr = this.x;
                            float f = (fArr[2] * 0.0f) + (fArr[1] * 1.0f) + (fArr[0] * 0.0f);
                            float f2 = (fArr[5] * 0.0f) + (fArr[4] * 1.0f) + (fArr[3] * 0.0f);
                            float f3 = fArr[6];
                            float f4 = fArr[7];
                            float f5 = fArr[8];
                            this.E = -(((float) Math.atan2(f2, f)) - 1.5707964f);
                        }
                        e(this.E + this.F, this.C);
                    } else {
                        d(-1.5707964f, this.x);
                        e(this.F, this.C);
                    }
                    d(1.5707964f, this.y);
                    c(this.z, this.C, this.y);
                    c(this.A, this.x, this.z);
                    d(this.G, this.B);
                    c(this.D, this.B, this.A);
                    GLES20.glUniformMatrix3fv(this.M, 1, false, this.D, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    b("drawArrays");
                    GLES20.glFinish();
                    this.R.eglSwapBuffers(this.S, this.U);
                    if (this.V) {
                        GLES20.glViewport(0, 0, this.I, this.H);
                        b("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.L, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.L, "uFOVy");
                        int i3 = this.I;
                        int i4 = this.H;
                        if (i3 > i4) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.H * 0.87266463f) / this.I);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.V = false;
                    }
                    try {
                        synchronized (this.Q) {
                            try {
                                if (!this.W && !this.V && this.N == 0) {
                                    this.Q.wait();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                this.w.a();
                this.J.setOnFrameAvailableListener(null);
                this.J = null;
                a();
            } catch (IllegalStateException unused2) {
                zzcgn.zzj("SphericalVideoProcessor halted unexpectedly.");
                this.w.a();
                this.J.setOnFrameAvailableListener(null);
                this.J = null;
                a();
            } catch (Throwable th2) {
                zzcgn.zzh("SphericalVideoProcessor died.", th2);
                com.google.android.gms.ads.internal.zzt.zzp().zzt(th2, "SphericalVideoProcessor.run.2");
                this.w.a();
                this.J.setOnFrameAvailableListener(null);
                this.J = null;
                a();
            }
        } catch (Throwable th3) {
            this.w.a();
            this.J.setOnFrameAvailableListener(null);
            this.J = null;
            a();
            throw th3;
        }
    }

    @Override // defpackage.d96
    public final void zza() {
        synchronized (this.Q) {
            this.Q.notifyAll();
        }
    }

    public final SurfaceTexture zzb() {
        if (this.K == null) {
            return null;
        }
        try {
            this.P.await();
        } catch (InterruptedException unused) {
        }
        return this.J;
    }

    public final void zzc(int i, int i2) {
        synchronized (this.Q) {
            this.I = i;
            this.H = i2;
            this.V = true;
            this.Q.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.I = i;
        this.H = i2;
        this.K = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.Q) {
            this.W = true;
            this.K = null;
            this.Q.notifyAll();
        }
    }

    public final void zzf(float f, float f2) {
        int i = this.I;
        int i2 = this.H;
        float f3 = i > i2 ? i : i2;
        this.F -= (f * 1.7453293f) / f3;
        float f4 = this.G - ((f2 * 1.7453293f) / f3);
        this.G = f4;
        if (f4 < -1.5707964f) {
            this.G = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.G = 1.5707964f;
        }
    }
}
