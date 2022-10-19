// Pixel Shader

uniform sampler2D sColors;

uniform float uWhite;

in vec3 vUV;

out vec4 fragColor;
void main()
{
	TDCheckDiscard();
	vec4 color = vec4(1.0);
	color= texture(sColors,vUV.st);
	if (uWhite > 0.0) color = vec4(1.0);

	TDAlphaTest(color.a);
	fragColor = TDOutputSwizzle(color);
}

