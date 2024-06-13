/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/main/resources/templates/*.{html,js}", "./node_modules/flowbite/**/*.js"
  ],
  theme: {
    extend: {
      boxShadow: {
        'custom-black': '0 10px 15px rgba(0, 0, 0, 0.7)',
      }
    },
  },
  plugins: [require('flowbite/plugin'), require('flowbite-typography'),
  ],
}

