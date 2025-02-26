import { Link } from "react-router-dom";

export default function Home() {
    return (
      <div className="mx-auto w-full bg-white">
        <aside className="relative overflow-hidden text-black rounded-lg sm:mx-16 mx-2 sm:py-8"> {/* reduced padding */}
          <div className="relative z-10 max-w-screen-xl px-4 pb-10 pt-5 sm:py-12 mx-auto sm:px-6 lg:px-8"> {/* reduced padding */}
            <div className="flex flex-col md:flex-row items-center justify-between gap-4"> {/* reduced gap */}
              {/* Image Section */}
              <div className="md:w-5/12 lg:w-4/12 order-2 md:order-1">
                <img
                  className="rounded-xl w-full max-w-sm h-auto object-cover" 
                  src="/src/assets/hello.jpg"
                  alt="image1"
                />
              </div>
  
              {/* Content Section */}
              <div className="md:w-6/12 space-y-4 text-center md:text-left order-1 md:order-2"> {/* reduced space-y */}
                <h2 className="text-3xl font-bold sm:text-4xl"> {/* reduced text size */}
                  Download Now
                  <span className="hidden sm:block text-3xl">Lorem Ipsum</span>
                </h2>
  
                <Link
                  className="inline-flex text-white items-center px-4 py-2 font-medium bg-orange-700 rounded-lg hover:opacity-75"
                  to="/"
                >
                  {/* ...existing SVG code... */}
                  &nbsp; Download now
                </Link>
              </div>
            </div>
          </div>
        </aside>
      </div>
    );
  }